package pl.prz.projekt.model;

import java.io.Serializable;

public class TypPublikacji implements Serializable {

	private int id_typ_publikacji;
	private String link_do_publikacji;
	
	public int getId_typ_publikacji() {
		return id_typ_publikacji;
	}

	public void setId_typ_publikacji(int id_typ_publikacji) {
		this.id_typ_publikacji = id_typ_publikacji;
	}

	public String getLink_do_publikacji() {
		return link_do_publikacji;
	}

	public void setLink_do_publikacji(String link_do_publikacji) {
		this.link_do_publikacji = link_do_publikacji;
	}

	@Override
    public String toString(){
        return "id_typ_publikacji="+id_typ_publikacji+", link_do_publikacji="+link_do_publikacji;
    }
}
