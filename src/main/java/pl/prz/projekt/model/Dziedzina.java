package pl.prz.projekt.model;

import java.io.Serializable;

public class Dziedzina implements Serializable {

	private int id_dziedziny;
	private String nazwa;
	
	public int getId_dziedziny() {
		return id_dziedziny;
	}

	public void setId_dziedziny(int id_dziedziny) {
		this.id_dziedziny = id_dziedziny;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	@Override
    public String toString(){
        return "id_dziedziny="+id_dziedziny+", nazwa="+nazwa;
    }
}
