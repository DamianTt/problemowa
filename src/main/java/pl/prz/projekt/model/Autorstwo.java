package pl.prz.projekt.model;

import java.io.Serializable;

public class Autorstwo implements Serializable {

	private int id_osoby;
	private int id_publikacji;
	
	@Override
    public String toString(){
        return "id_osoby="+id_osoby+", id_publikacji="+id_publikacji;
    }
	
}
