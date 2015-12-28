package pl.prz.projekt.dao;

import java.util.List;

import pl.prz.projekt.model.PublicationType;

public interface PublicationTypeDAO {
	
	public void addPublicationType(PublicationType t);
	public List<PublicationType> listPublicationType();
	public void deletePublicationType (PublicationType t);
	public PublicationType updatePublicationType (PublicationType t);

}
