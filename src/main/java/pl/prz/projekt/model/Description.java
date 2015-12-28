package pl.prz.projekt.model;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Repository;

@Entity
@Table(name="description", uniqueConstraints= @UniqueConstraint(columnNames="ID"))
@ManagedBean(name="Description")
public class Description implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8410022945131764856L;

	public Description(){}
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@NotNull
	private int ID;
	
	@Column(name="note")
	@NotNull
	private String note;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="fk_pub_id", nullable=false)
	private Publication publication;
	
	public Publication getPublication() {
		return publication;
	}

	public void setPublication(Publication publication) {
		this.publication = publication;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString(){
		return "id="+ID+", note="+note;
	}
	
}
