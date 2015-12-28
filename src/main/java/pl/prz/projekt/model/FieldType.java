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


@Entity
@Table(name="field_type", uniqueConstraints= @UniqueConstraint(columnNames="ID"))
@ManagedBean(name="FieldType")
public class FieldType implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6060349777869830601L;
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@NotNull
	private int ID;
	
	@Column(name="type")
	@NotNull
	private String type;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="fk_pub_field_id")
	private PublicationField publicationField;
	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
