package pl.prz.projekt.model;

import java.io.Serializable;
import java.util.Date;

public class Publikacja implements Serializable {

	private int id_publikacji;
	private String tytul;
	private Date data_wystawienia;
	private int ISBN;
	private String spis_tresci;
	private String opis;
	private String okladka;
	
	public int getId_publikacji() {
		return id_publikacji;
	}

	public void setId_publikacji(int id_publikacji) {
		this.id_publikacji = id_publikacji;
	}

	public String getTytul() {
		return tytul;
	}

	public void setTytul(String tytul) {
		this.tytul = tytul;
	}

	public Date getData_wystawienia() {
		return data_wystawienia;
	}

	public void setData_wystawienia(Date data_wystawienia) {
		this.data_wystawienia = data_wystawienia;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public String getSpis_tresci() {
		return spis_tresci;
	}

	public void setSpis_tresci(String spis_tresci) {
		this.spis_tresci = spis_tresci;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public String getOkladka() {
		return okladka;
	}

	public void setOkladka(String okladka) {
		this.okladka = okladka;
	}

	@Override
    public String toString(){
        return "id_publikacji="+id_publikacji+", tytul="+tytul+", data_wystawienia="+data_wystawienia+", ISBN="+ISBN+", spis_tresci="+spis_tresci+", opis="+opis+", okladka="+okladka;
    }
}
