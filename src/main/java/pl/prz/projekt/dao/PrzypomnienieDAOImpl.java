package pl.prz.projekt.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import pl.prz.projekt.model.Przypomnienie;
@Repository
public class PrzypomnienieDAOImpl implements PrzypomnienieDAO {

private static final Logger logger = LoggerFactory.getLogger(OsobaDAOImpl.class);
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	@Override
	public void addPrzypomnienie(Przypomnienie p) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Przypomnienie> listPrzypomnienie() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<Przypomnienie> przypomnienieList = session.createQuery("from Przypomnienie").list();
		return przypomnienieList;
	}

	@Override
	public void deletePrzypomnienie(Przypomnienie p) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.delete(p);

	}

	@Override
	public Przypomnienie updatePrzypomnienie(Przypomnienie p) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		if (session.contains(p))
			session.update(p);
		else
			p = (Przypomnienie) session.merge(p);
		return p;
	}

}
