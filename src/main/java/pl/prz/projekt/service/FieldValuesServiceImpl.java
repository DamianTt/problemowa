package pl.prz.projekt.service;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pl.prz.projekt.dao.FieldValuesDAO;
import pl.prz.projekt.model.FieldValues;

@Service
@ManagedBean(name = "FieldValuesService")
@SessionScoped
public class FieldValuesServiceImpl implements FieldValuesService {

	@Autowired
	private FieldValuesDAO fieldValuesDAO;

	public void setFieldValuesDAO(FieldValuesDAO fieldValuesDAO) {
		this.fieldValuesDAO = fieldValuesDAO;
	}

	@Override
	@Transactional
	public void addFieldValues(FieldValues v) {

		this.fieldValuesDAO.addFieldValues(v);

	}

	@Override
	@Transactional
	public List<FieldValues> listFieldValues() {

		return this.fieldValuesDAO.listFieldValues();
	}

	@Override
	@Transactional
	public void deleteFieldValues(FieldValues v) {

		this.fieldValuesDAO.deleteFieldValues(v);
	}

	@Override
	@Transactional
	public FieldValues updateFieldValues(FieldValues v) {

		return this.fieldValuesDAO.updateFieldValues(v);
	}

}
