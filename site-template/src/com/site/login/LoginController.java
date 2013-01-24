package com.site.login;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.site.utils.MessagesController;

@ManagedBean(name="loginController")
@RequestScoped
public class LoginController {

	private LoginForm login = new LoginForm();
		
	public LoginForm getLogin() {
		return login;
	}

	public void setLogin(LoginForm login) {
		this.login = login;
	}


	public String realizarLogin(){
		if(login.getNome().equals("admin") && login.getSenha().equals("admin")){
			return "inicialProtected";
		}
		MessagesController.addWarn(null, "O nome/senha não conferem.", null);
		return null;
	}

}
