package pl.prz.projekt.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import pl.prz.projekt.model.TypPublikacji;
@Repository
public class TypPublikacjiDAOImpl implements TypPublikacjiDAO {

private static final Logger logger = LoggerFactory.getLogger(OsobaDAOImpl.class);
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<TypPublikacji> listPrzypomnienie() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<TypPublikacji> typList = session.createQuery("from TypPublikacji").list();
		return typList;
	}

}
