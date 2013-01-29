package com.facade;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.dao.ContactDAO;
import com.model.Contact;

@Stateless
public class ContactFacadeImpl implements ContactFacade {

	@EJB
	private ContactDAO contactDAO;

	@Override
	public void save(Contact contact) {
		isContactMessageWithAllData(contact);

		contactDAO.save(contact);
	}

	@Override
	public Contact update(Contact contact) {
		isContactMessageWithAllData(contact);

		return contactDAO.update(contact);
	}

	@Override
	public void delete(Contact contact) {
		contactDAO.delete(contact);
	}

	@Override
	public List<Contact> findAll() {
		return contactDAO.findAll();
	}
	
    private void isContactMessageWithAllData(Contact contact){
        boolean hasError = false;
 
        if(contact == null){
            hasError = true;
        }
 
        if (contact.getNome() == null || "".equals(contact.getNome().trim())){
            hasError = true;
        }
        if (contact.getEmail() == null || "".equals(contact.getEmail().trim())){
            hasError = true;
        }
        if (contact.getMensagem() == null || "".equals(contact.getMensagem().trim())){
            hasError = true;
        }
 
        if (hasError){
            throw new IllegalArgumentException("The user is missing data. Check the name and password, they should have value.");
        }
    }
}
