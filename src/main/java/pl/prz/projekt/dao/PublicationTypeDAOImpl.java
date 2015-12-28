package pl.prz.projekt.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.LoggerFactory;

import pl.prz.projekt.model.PublicationType;

public class PublicationTypeDAOImpl implements PublicationTypeDAO {

	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(PublicationTypeDAOImpl.class);

	private SessionFactory sessionFactory;
	
	
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addPublicationType(PublicationType t) {
		
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(t);
	
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<PublicationType> listPublicationType() {

		Session session = this.sessionFactory.getCurrentSession();
		List<PublicationType> publicationTypeList = session.createQuery("from PublicationType").list();
		return publicationTypeList;
		
	}

	@Override
	public void deletePublicationType(PublicationType t) {

		Session session = this.sessionFactory.getCurrentSession();
		session.delete(t);
		
	}

	@Override
	public PublicationType updatePublicationType(PublicationType t) {
		
		Session session = this.sessionFactory.getCurrentSession();
		if (session.contains(t))
			session.update(t);
		else 
			t=(PublicationType)session.merge(t);
		return t;
	}

}
