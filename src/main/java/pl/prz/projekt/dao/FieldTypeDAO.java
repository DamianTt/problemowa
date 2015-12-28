package pl.prz.projekt.dao;

import java.util.List;

import pl.prz.projekt.model.FieldType;

public interface FieldTypeDAO {
	
	public void addFieldType(FieldType f);
	public List<FieldType> listFieldType();
	public void deleteFieldType (FieldType f);
	public FieldType updateFieldType (FieldType f);

}
