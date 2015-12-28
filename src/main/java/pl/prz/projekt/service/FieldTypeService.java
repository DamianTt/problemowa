package pl.prz.projekt.service;

import java.util.List;

import pl.prz.projekt.model.FieldType;

public interface FieldTypeService {
	
	public void addFieldType(FieldType f);
	public List<FieldType> listFieldType();
	public void deleteFieldType (FieldType f);
	public FieldType updateFieldType (FieldType f);

}
