package pl.prz.projekt.service;

import java.util.List;

import pl.prz.projekt.model.Link;

public interface LinkService {
	
	public void addLink(Link l);
	public List<Link> listLink();
	public void deleteLink (Link l);
	public Link updateLink (Link l);

}
