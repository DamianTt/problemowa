package pl.prz.projekt.service;

import java.util.List;

import pl.prz.projekt.model.PublicationType;

public interface PublicationTypeService {
	
	public void addPublicationType(PublicationType t);
	public List<PublicationType> listPublicationType();
	public void deletePublicationType (PublicationType t);
	public PublicationType updatePublicationType (PublicationType t);

}
