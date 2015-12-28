package pl.prz.projekt.dao;

import java.util.List;

import pl.prz.projekt.model.FieldValues;

public interface FieldValuesDAO {
	
	public void addFieldValues(FieldValues f);
	public List<FieldValues> listFieldValues();
	public void deleteFieldValues (FieldValues f);
	public FieldValues updateFieldValues (FieldValues f);

}
