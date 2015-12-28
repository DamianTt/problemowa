package pl.prz.projekt.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import pl.prz.projekt.model.FieldValues;

public class FieldValuesDAOImpl implements FieldValuesDAO {

	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(FieldValuesDAOImpl.class);

	private SessionFactory sessionFactory;
	
	
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addFieldValues(FieldValues f) {
		
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(f);
	
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<FieldValues> listFieldValues() {

		Session session = this.sessionFactory.getCurrentSession();
		List<FieldValues> fieldValuesList = session.createQuery("from FieldValues").list();
		return fieldValuesList;
		
	}

	@Override
	public void deleteFieldValues(FieldValues f) {

		Session session = this.sessionFactory.getCurrentSession();
		session.delete(f);
		
	}

	@Override
	public FieldValues updateFieldValues(FieldValues f) {
		
		Session session = this.sessionFactory.getCurrentSession();
		if (session.contains(f))
			session.update(f);
		else 
			f=(FieldValues)session.merge(f);
		return f;
	}

}
