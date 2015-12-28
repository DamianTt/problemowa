package pl.prz.projekt.service;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pl.prz.projekt.dao.PublicationFieldDAO;
import pl.prz.projekt.model.PublicationField;

@Service
@ManagedBean(name="PublicationFieldService")
@SessionScoped
public class PublicationFieldServiceImpl implements PublicationFieldService {

	@Autowired
	private PublicationFieldDAO publicationFieldDAO;
	
	
	public void setPublicationFieldDAO(PublicationFieldDAO publicationFieldDAO) {
		this.publicationFieldDAO = publicationFieldDAO;
	}

	@Override
	@Transactional
	public void addPublicationField(PublicationField f) {
		
		this.publicationFieldDAO.addPublicationField(f);
		
	}

	@Override
	@Transactional
	public List<PublicationField> listPublicationField() {

		return this.publicationFieldDAO.listPublicationField();
	}

	@Override
	@Transactional
	public void deletePublicationField(PublicationField f) {
		
		this.publicationFieldDAO.deletePublicationField(f);
	}

	@Override
	@Transactional
	public PublicationField updatePublicationField(PublicationField f) {

		return this.publicationFieldDAO.updatePublicationField(f);
	}

}
