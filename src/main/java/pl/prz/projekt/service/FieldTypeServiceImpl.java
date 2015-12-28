package pl.prz.projekt.service;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pl.prz.projekt.dao.FieldTypeDAO;
import pl.prz.projekt.model.FieldType;

@Service
@ManagedBean(name="FieldTypeService")
@SessionScoped
public class FieldTypeServiceImpl implements FieldTypeService {

	@Autowired
	private FieldTypeDAO fieldTypeDAO;
	
	
	public void setFieldTypeDAO(FieldTypeDAO descriptionDAO) {
		this.fieldTypeDAO = descriptionDAO;
	}

	@Override
	@Transactional
	public void addFieldType(FieldType f) {
		
		this.fieldTypeDAO.addFieldType(f);
		
	}

	@Override
	@Transactional
	public List<FieldType> listFieldType() {

		return this.fieldTypeDAO.listFieldType();
	}

	@Override
	@Transactional
	public void deleteFieldType(FieldType f) {
		
		this.fieldTypeDAO.deleteFieldType(f);
	}

	@Override
	@Transactional
	public FieldType updateFieldType(FieldType f) {

		return this.fieldTypeDAO.updateFieldType(f);
	}

}
