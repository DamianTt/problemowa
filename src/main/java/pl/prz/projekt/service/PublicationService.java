package pl.prz.projekt.service;

import java.util.List;

import pl.prz.projekt.model.Publication;

public interface PublicationService {
	
	public void addPublication(Publication p);
	public List<Publication> listPublication();
	public void deletePublication (Publication p);
	public Publication updatePublication (Publication p);

}
