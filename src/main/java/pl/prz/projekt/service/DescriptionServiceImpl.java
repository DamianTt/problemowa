package pl.prz.projekt.service;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pl.prz.projekt.dao.DescriptionDAO;
import pl.prz.projekt.model.Description;

@Service
@ManagedBean(name="DescriptionService")
@SessionScoped
public class DescriptionServiceImpl implements DescriptionService {

	@Autowired
	private DescriptionDAO descriptionDAO;
	
	
	public void setDescriptionDAO(DescriptionDAO descriptionDAO) {
		this.descriptionDAO = descriptionDAO;
	}

	@Override
	@Transactional
	public void addDescription(Description d) {
		
		this.descriptionDAO.addDescription(d);
		
	}

	@Override
	@Transactional
	public List<Description> listDescription() {

		return this.descriptionDAO.listDescription();
	}

	@Override
	@Transactional
	public void deleteDescription(Description d) {
		
		this.descriptionDAO.deleteDescription(d);
	}

	@Override
	@Transactional
	public Description updateDescription(Description d) {

		return this.descriptionDAO.updateDescription(d);
	}

}
