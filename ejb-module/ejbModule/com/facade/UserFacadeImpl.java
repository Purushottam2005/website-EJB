package com.facade;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.dao.UserDAO;
import com.model.User;

@Stateless
public class UserFacadeImpl implements UserFacade {

	@EJB
	private UserDAO userDAO;

	@Override
	public void save(User user) {
		isUserWithAllData(user);

		userDAO.save(user);
	}

	@Override
	public User update(User user) {
		isUserWithAllData(user);

		return userDAO.update(user);
	}

	@Override
	public void delete(User user) {
		userDAO.delete(user);
	}

	public User findUserByEmail(String email) {
		return userDAO.findUserByEmail(email);
	}

	@Override
	public List<User> findAll() {
		return userDAO.findAll();
	}
	
    private void isUserWithAllData(User user){
        boolean hasError = false;
 
        if(user == null){
            hasError = true;
        }
 
        if (user.getNome() == null || "".equals(user.getNome().trim())){
            hasError = true;
        }
        if (user.getSenha() == null || "".equals(user.getSenha().trim())){
            hasError = true;
        }

 
        if (hasError){
            throw new IllegalArgumentException("The user is missing data. Check the name and password, they should have value.");
        }
    }
}
