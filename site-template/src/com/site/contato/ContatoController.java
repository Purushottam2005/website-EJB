package com.site.contato;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.site.utils.MessagesController;

@ManagedBean(name="contato")
@RequestScoped
public class ContatoController {
	
	ContatoForm form = new ContatoForm();

	public void enviarMensagem(){
		
		String msg = "Mensagem de contato recebida. Nome: " + form.getNome() + 
				" E-mail: " + form.getEmail() + " Mensagem: " + form.getMensagem();
		
		MessagesController.addInfo(null, msg, null);
		
	}

	public ContatoForm getForm() {
		return form;
	}

	public void setForm(ContatoForm form) {
		this.form = form;
	}

}
