package pl.prz.projekt.model;

import java.io.Serializable;
import java.util.Date;

public class Przypomnienie implements Serializable {

	private int id_przypomnienia;
	private Date data_przypomnienia;
	private String uwagi;
	
	public int getId_przypomnienia() {
		return id_przypomnienia;
	}

	public void setId_przypomnienia(int id_przypomnienia) {
		this.id_przypomnienia = id_przypomnienia;
	}

	public Date getData_przypomnienia() {
		return data_przypomnienia;
	}

	public void setData_przypomnienia(Date data_przypomnienia) {
		this.data_przypomnienia = data_przypomnienia;
	}

	public String getUwagi() {
		return uwagi;
	}

	public void setUwagi(String uwagi) {
		this.uwagi = uwagi;
	}

	@Override
    public String toString(){
        return "id_przypomnienia="+id_przypomnienia+", data_przypomnienia="+data_przypomnienia+", uwagi="+uwagi;
    }
}
