package pl.prz.projekt.dao;

import java.util.List;

import pl.prz.projekt.model.Osoba;

public interface OsobaDAO {

	public void addOsoba(Osoba o);
	public List<Osoba> listOsoba();
	public void deleteOsoba (Osoba o);
	public Osoba updateOsoba (Osoba o);
}
