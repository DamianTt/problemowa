package pl.prz.projekt.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import pl.prz.projekt.model.Description;

public class DescriptionDAOImpl implements DescriptionDAO {

	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(DescriptionDAOImpl.class);

	private SessionFactory sessionFactory;
	
	
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addDescription(Description d) {
		
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(d);
	
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Description> listDescription() {

		Session session = this.sessionFactory.getCurrentSession();
		List<Description> descriptionList = session.createQuery("from Description").list();
		return descriptionList;
		
	}

	@Override
	public void deleteDescription(Description d) {

		Session session = this.sessionFactory.getCurrentSession();
		session.delete(d);
		
	}

	@Override
	public Description updateDescription(Description d) {
		
		Session session = this.sessionFactory.getCurrentSession();
		if (session.contains(d))
			session.update(d);
		else 
			d=(Description)session.merge(d);
		return d;
	}

}
