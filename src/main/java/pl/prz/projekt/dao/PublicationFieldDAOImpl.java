package pl.prz.projekt.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import pl.prz.projekt.model.PublicationField;

public class PublicationFieldDAOImpl implements PublicationFieldDAO {
	
	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(PublicationFieldDAOImpl.class);

	private SessionFactory sessionFactory;
	
	
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addPublicationField(PublicationField f) {
		
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(f);
	
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<PublicationField> listPublicationField() {

		Session session = this.sessionFactory.getCurrentSession();
		List<PublicationField> publicationFieldList = session.createQuery("from PublicationField").list();
		return publicationFieldList;
		
	}

	@Override
	public void deletePublicationField(PublicationField f) {

		Session session = this.sessionFactory.getCurrentSession();
		session.delete(f);
		
	}

	@Override
	public PublicationField updatePublicationField(PublicationField f) {
		
		Session session = this.sessionFactory.getCurrentSession();
		if (session.contains(f))
			session.update(f);
		else 
			f=(PublicationField)session.merge(f);
		return f;
	}

}
