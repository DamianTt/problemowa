package pl.prz.projekt.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import pl.prz.projekt.model.Osoba;
@Repository
public class OsobaDAOImpl implements OsobaDAO {

	private static final Logger logger = LoggerFactory.getLogger(OsobaDAOImpl.class);
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	@Override
	public void addOsoba(Osoba o) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(o);
		logger.info("Osoba zapisana poprawnie, Dane osoby="+o);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Osoba> listOsoba() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<Osoba> osobaList = session.createQuery("from Osoba").list();
		return osobaList;
	}

	@Override
	public void deleteOsoba(Osoba o) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.delete(o);
	}

	@Override
	public Osoba updateOsoba(Osoba o) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		if (session.contains(o))
			session.update(o);
		else
			o = (Osoba) session.merge(o);
		return null;
	}

}
