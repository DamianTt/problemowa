package pl.prz.projekt.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import pl.prz.projekt.model.Reminder;

public class ReminderDAOImpl implements ReminderDAO {

	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(ReminderDAOImpl.class);

	private SessionFactory sessionFactory;
	
	
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addReminder(Reminder r) {
		
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(r);
	
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Reminder> listReminder() {

		Session session = this.sessionFactory.getCurrentSession();
		List<Reminder> reminderList = session.createQuery("from Reminder").list();
		return reminderList;
		
	}

	@Override
	public void deleteReminder(Reminder r) {

		Session session = this.sessionFactory.getCurrentSession();
		session.delete(r);
		
	}

	@Override
	public Reminder updateReminder(Reminder r) {
		
		Session session = this.sessionFactory.getCurrentSession();
		if (session.contains(r))
			session.update(r);
		else 
			r=(Reminder)session.merge(r);
		return r;
	}

}
