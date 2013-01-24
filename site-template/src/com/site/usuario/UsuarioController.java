package com.site.usuario;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="usuarioController")
@RequestScoped
public class UsuarioController {

	UsuarioForm formUser = new UsuarioForm();

	public UsuarioForm getFormUser() {
		return formUser;
	}

	public void setFormUser(UsuarioForm formUser) {
		this.formUser = formUser;
	}
	
	public void cadastrarUsuario(){
		System.out.println("Usuário: " + formUser.getNome() + " " +
				formUser.getSenha() + " " +
				formUser.getEmail()+ " " +
				formUser.getRole() + " ");
	}
}
