package pl.prz.projekt.dao;

import java.util.List;

import pl.prz.projekt.model.User;

public interface UserDAO {

	public void addUser(User u);
	public List<User> listUser();
	public void deleteUser (User u);
	public User updateUser (User u);
	
}
