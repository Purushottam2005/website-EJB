package com.dao;

import javax.ejb.Stateless;
import com.model.Contact;

@Stateless
public class ContactDAO extends GenericDAO<Contact> {

	public ContactDAO(){
		super(Contact.class);
	}
}
