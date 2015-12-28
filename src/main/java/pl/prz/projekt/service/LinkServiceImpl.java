package pl.prz.projekt.service;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pl.prz.projekt.dao.LinkDAO;
import pl.prz.projekt.model.Link;

@Service
@ManagedBean(name="LinkService")
@SessionScoped
public class LinkServiceImpl implements LinkService {

	@Autowired
	private LinkDAO linkDAO;
	
	
	public void setLinkDAO(LinkDAO linkDAO) {
		this.linkDAO = linkDAO;
	}

	@Override
	@Transactional
	public void addLink(Link l) {
		
		this.linkDAO.addLink(l);
		
	}

	@Override
	@Transactional
	public List<Link> listLink() {

		return this.linkDAO.listLink();
	}

	@Override
	@Transactional
	public void deleteLink(Link l) {
		
		this.linkDAO.deleteLink(l);
	}

	@Override
	@Transactional
	public Link updateLink(Link l) {

		return this.linkDAO.updateLink(l);
	}

}
