package com.site.contato;

import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.facade.ContactFacade;
import com.model.Contact;
import com.site.utils.MessagesController;

@ManagedBean(name = "contatoController")
@RequestScoped
public class ContatoController {

	@EJB
	private ContactFacade contactFacade;

	private Contact contactMessage;

	public Contact getContactMessage() {

		if (contactMessage == null) {
			contactMessage = new Contact();
		}
		return contactMessage;
	}

	public void setContactMessage(Contact contactMessage) {
		this.contactMessage = contactMessage;
	}

	public void createAndSendMessage() {
		try {
			contactFacade.save(contactMessage);
		} catch (EJBException e) {
			MessagesController
					.addError(
							null,
							"Não foi possível enviar a mensagem. Tente novamente mais tarde.",
							null);
		}
		MessagesController.addInfo(null, "Mensagem enviada com sucesso.",
				null);
	}

}
