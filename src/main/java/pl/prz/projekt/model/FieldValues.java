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
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Repository;

@Entity
@Table(name="field_values", uniqueConstraints= @UniqueConstraint(columnNames="ID"))
@ManagedBean(name="FieldValues")
public class FieldValues implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6162474161052741812L;

	public FieldValues(){
		
	}

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@NotNull
	private int ID;
	
	@Column(name="value")
	@NotNull
	private String value;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="fk_pub_id")
	private Publication publication;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="fk_pub_field_id")
	private PublicationField publicationField;
	

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Publication getPublication() {
		return publication;
	}

	public void setPublication(Publication publication) {
		this.publication = publication;
	}

	public PublicationField getPublicationField() {
		return publicationField;
	}

	public void setPublicationField(PublicationField publicationField) {
		this.publicationField = publicationField;
	}
	
}
