package pl.prz.projekt.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import pl.prz.projekt.model.Publication;

public class PublicationDAOImpl implements PublicationDAO {

	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(PublicationDAOImpl.class);

	private SessionFactory sessionFactory;
	
	
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addPublication(Publication p) {
		
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
	
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Publication> listPublication() {

		Session session = this.sessionFactory.getCurrentSession();
		List<Publication> publicationList = session.createQuery("from Publication").list();
		return publicationList;
		
	}

	@Override
	public void deletePublication(Publication p) {

		Session session = this.sessionFactory.getCurrentSession();
		session.delete(p);
		
	}

	@Override
	public Publication updatePublication(Publication p) {
		
		Session session = this.sessionFactory.getCurrentSession();
		if (session.contains(p))
			session.update(p);
		else 
			p=(Publication)session.merge(p);
		return p;
	}

}
