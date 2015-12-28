package pl.prz.projekt.service;

import java.util.List;

import pl.prz.projekt.model.FieldValues;

public interface FieldValuesService {
	
	public void addFieldValues(FieldValues v);
	public List<FieldValues> listFieldValues();
	public void deleteFieldValues (FieldValues v);
	public FieldValues updateFieldValues (FieldValues v);

}
