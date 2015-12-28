package pl.prz.projekt.dao;

import java.util.List;

import pl.prz.projekt.model.PublicationField;

public interface PublicationFieldDAO {
	
	public void addPublicationField(PublicationField f);
	public List<PublicationField> listPublicationField();
	public void deletePublicationField (PublicationField f);
	public PublicationField updatePublicationField (PublicationField f);

}
