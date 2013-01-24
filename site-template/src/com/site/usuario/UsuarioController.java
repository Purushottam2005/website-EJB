package com.site.usuario;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.facade.UserFacade;
import com.model.User;

@ManagedBean(name = "usuarioController")
@RequestScoped
public class UsuarioController {

	@EJB
	private UserFacade userFacade;

	public void cadastrarUsuario() {

	}

    public List<User> getAllUsers() {
        return userFacade.findAll();
    }
}
