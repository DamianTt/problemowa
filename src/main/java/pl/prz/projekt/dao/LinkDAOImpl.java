package pl.prz.projekt.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import pl.prz.projekt.model.Link;

public class LinkDAOImpl implements LinkDAO {

	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(LinkDAOImpl.class);

	private SessionFactory sessionFactory;
	
	
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addLink(Link l) {
		
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(l);
	
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Link> listLink() {

		Session session = this.sessionFactory.getCurrentSession();
		List<Link> linkList = session.createQuery("from Link").list();
		return linkList;
		
	}

	@Override
	public void deleteLink(Link l) {

		Session session = this.sessionFactory.getCurrentSession();
		session.delete(l);
		
	}

	@Override
	public Link updateLink(Link l) {
		
		Session session = this.sessionFactory.getCurrentSession();
		if (session.contains(l))
			session.update(l);
		else 
			l=(Link)session.merge(l);
		return l;
	}

}
