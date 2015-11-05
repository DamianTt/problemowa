package pl.prz.projekt.dao;

import java.util.List;

import pl.prz.projekt.model.Publikacja;

public interface PublikacjaDAO {
	public void addPublikacja(Publikacja p);
	public List<Publikacja> listPublikacja ();
	public void deletePublikacja (Publikacja p);
	public Publikacja updatePublikacja (Publikacja p);

}
