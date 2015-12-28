package pl.prz.projekt.service;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pl.prz.projekt.dao.PublicationTypeDAO;
import pl.prz.projekt.model.PublicationType;

@Service
@ManagedBean(name="PublicationTypeService")
@SessionScoped
public class PublicationTypeServiceImpl implements PublicationTypeService {

	@Autowired
	private PublicationTypeDAO publicationTypeDAO;
	
	
	public void setPublicationTypeDAO(PublicationTypeDAO publicationTypeDAO) {
		this.publicationTypeDAO = publicationTypeDAO;
	}

	@Override
	@Transactional
	public void addPublicationType(PublicationType t) {
		
		this.publicationTypeDAO.addPublicationType(t);
		
	}

	@Override
	@Transactional
	public List<PublicationType> listPublicationType() {

		return this.publicationTypeDAO.listPublicationType();
	}

	@Override
	@Transactional
	public void deletePublicationType(PublicationType t) {
		
		this.publicationTypeDAO.deletePublicationType(t);
	}

	@Override
	@Transactional
	public PublicationType updatePublicationType(PublicationType t) {

		return this.publicationTypeDAO.updatePublicationType(t);
	}

}
