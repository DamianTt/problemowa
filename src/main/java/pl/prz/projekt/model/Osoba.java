package pl.prz.projekt.model;

import java.io.Serializable;

public class Osoba implements Serializable {

	private int id_osoby;
	private String imie;
	private String nazwisko;
	private String email;
	private String haslo;
	private String administrator;
	private int telefon;


@Override
public String toString(){
    return "id_osoby="+id_osoby+", imie="+imie+", nazwisko="+nazwisko+", email="+email+", haslo="+haslo+", administrator="+administrator+", telefon="+telefon;
}


public int getId_osoby() {
	return id_osoby;
}


public void setId_osoby(int id_osoby) {
	this.id_osoby = id_osoby;
}


public String getImie() {
	return imie;
}


public void setImie(String imie) {
	this.imie = imie;
}


public String getNazwisko() {
	return nazwisko;
}


public void setNazwisko(String nazwisko) {
	this.nazwisko = nazwisko;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public String getHaslo() {
	return haslo;
}


public void setHaslo(String haslo) {
	this.haslo = haslo;
}


public String getAdministrator() {
	return administrator;
}


public void setAdministrator(String administrator) {
	this.administrator = administrator;
}


public int getTelefon() {
	return telefon;
}


public void setTelefon(int telefon) {
	this.telefon = telefon;
}

}