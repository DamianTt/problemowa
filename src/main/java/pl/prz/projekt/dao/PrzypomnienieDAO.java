package pl.prz.projekt.dao;

import java.util.List;

import pl.prz.projekt.model.Przypomnienie;

public interface PrzypomnienieDAO {
	public void addPrzypomnienie (Przypomnienie p);
	public List<Przypomnienie> listPrzypomnienie();
	public void deletePrzypomnienie (Przypomnienie p);
	public Przypomnienie updatePrzypomnienie (Przypomnienie p); 
}
