package pl.prz.projekt.service;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pl.prz.projekt.dao.UserDAO;
import pl.prz.projekt.model.User;

@Service
@ManagedBean(name="UserService")
@SessionScoped
public class UserServiceImpl implements UserService {

	private UserDAO userDAO;
	
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	@Transactional
	public void addUser(User u) {
		
		userDAO.addUser(u);
		
	}

	@Override
	@Transactional
	public List<User> listUser() {

		return this.userDAO.listUser();
	}

	@Override
	@Transactional
	public void deleteUser(User u) {
		
		this.userDAO.deleteUser(u);
	}

	@Override
	@Transactional
	public User updateUser(User u) {

		return this.userDAO.updateUser(u);
	}

}
