package pl.prz.projekt.service;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pl.prz.projekt.dao.PublicationDAO;
import pl.prz.projekt.model.Publication;

@Service
@ManagedBean(name="PublicationService")
@SessionScoped
public class PublicationServiceImpl implements PublicationService {

	@Autowired
	private PublicationDAO publicationDAO;
	
	
	public void setPublicationDAO(PublicationDAO publicationDAO) {
		this.publicationDAO = publicationDAO;
	}

	@Override
	@Transactional
	public void addPublication(Publication p) {
		
		this.publicationDAO.addPublication(p);
		
	}

	@Override
	@Transactional
	public List<Publication> listPublication() {

		return this.publicationDAO.listPublication();
	}

	@Override
	@Transactional
	public void deletePublication(Publication p) {
		
		this.publicationDAO.deletePublication(p);
	}

	@Override
	@Transactional
	public Publication updatePublication(Publication p) {

		return this.publicationDAO.updatePublication(p);
	}

}
