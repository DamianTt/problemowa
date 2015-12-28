package pl.prz.projekt.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import pl.prz.projekt.model.FieldType;

public class FieldTypeDAOImpl implements FieldTypeDAO {

	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(FieldTypeDAOImpl.class);

	private SessionFactory sessionFactory;
	
	
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addFieldType(FieldType f) {
		
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(f);
	
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<FieldType> listFieldType() {

		Session session = this.sessionFactory.getCurrentSession();
		List<FieldType> descriptionList = session.createQuery("from FieldType").list();
		return descriptionList;
		
	}

	@Override
	public void deleteFieldType(FieldType f) {

		Session session = this.sessionFactory.getCurrentSession();
		session.delete(f);
		
	}

	@Override
	public FieldType updateFieldType(FieldType f) {
		
		Session session = this.sessionFactory.getCurrentSession();
		if (session.contains(f))
			session.update(f);
		else 
			f=(FieldType)session.merge(f);
		return f;
	}

}
