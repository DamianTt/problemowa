package pl.prz.projekt.service;

import java.util.List;

import pl.prz.projekt.model.Description;

public interface DescriptionService {
	
	public void addDescription(Description d);
	public List<Description> listDescription();
	public void deleteDescription (Description d);
	public Description updateDescription (Description d);

}
