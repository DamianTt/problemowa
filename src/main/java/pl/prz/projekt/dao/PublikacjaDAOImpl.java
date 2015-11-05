package pl.prz.projekt.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import pl.prz.projekt.model.Publikacja;
@Repository
public class PublikacjaDAOImpl implements PublikacjaDAO {

private static final Logger logger = LoggerFactory.getLogger(OsobaDAOImpl.class);
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	@Override
	public void addPublikacja(Publikacja p) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Publikacja> listPublikacja() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<Publikacja> publikacjaList = session.createQuery("from Publikacja").list();
		return publikacjaList;
	}

	@Override
	public void deletePublikacja(Publikacja p) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.delete(p);
	}

	@Override
	public Publikacja updatePublikacja(Publikacja p) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		if (session.contains(p))
			session.update(p);
		else
			p = (Publikacja) session.merge(p);
		return p;
	}

}
