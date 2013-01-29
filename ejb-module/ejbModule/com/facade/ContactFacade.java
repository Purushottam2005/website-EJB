package com.facade;

import java.util.List;

import javax.ejb.Local;

import com.model.Contact;

@Local
public interface ContactFacade {
	
	public abstract List<Contact> findAll();

	public abstract void save(Contact contact);

	public abstract Contact update(Contact contact);

	public abstract void delete(Contact contact);

}
