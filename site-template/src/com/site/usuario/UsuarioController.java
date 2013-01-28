package com.site.usuario;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.facade.UserFacade;
import com.model.User;
import com.site.utils.MessagesController;

@ManagedBean(name = "usuarioController")
@RequestScoped
public class UsuarioController {

	@EJB
	private UserFacade userFacade;

	private User user;

	public User getUser() {

		if (user == null) {
			user = new User();
		}

		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<User> getAllUsers() {
		return userFacade.findAll();
	}

	public void createUser() {
		try {
			userFacade.save(user);
		} catch (EJBException e) {
			MessagesController
					.addError(
							null,
							"Não foi possível criar uma conta. Tente novamente mais tarde.",
							null);
		}
		MessagesController.addInfo(null, "Cadastro realizado com sucesso.",
				null);
	}
}
