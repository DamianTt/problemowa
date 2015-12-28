package pl.prz.projekt.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import pl.prz.projekt.model.User;

public class UserDAOImpl implements UserDAO {

	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(UserDAOImpl.class);

	private SessionFactory sessionFactory;
	
	
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addUser(User u) {
		
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(u);
	
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> listUser() {

		Session session = this.sessionFactory.getCurrentSession();
		List<User> userList = session.createQuery("from User").list();
		return userList;
		
	}

	@Override
	public void deleteUser(User u) {

		Session session = this.sessionFactory.getCurrentSession();
		session.delete(u);
		
	}

	@Override
	public User updateUser(User u) {
		
		Session session = this.sessionFactory.getCurrentSession();
		if (session.contains(u))
			session.update(u);
		else 
			u=(User)session.merge(u);
		return u;
	}

}
