package pl.prz.projekt.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.faces.bean.ManagedBean;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="publication_field", uniqueConstraints= @UniqueConstraint(columnNames="ID"))
@ManagedBean(name="PublicationField")
public class PublicationField implements Serializable {
	
	private static final long serialVersionUID = -2348859175006291184L;

	public PublicationField(){
		
	}

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@NotNull
	private int ID;
	
	@Column(name="name")
	@NotNull
	private String name;
	
	@OneToMany(mappedBy="publicationField", cascade=CascadeType.ALL)
	private Set<FieldValues> fieldValues = new HashSet<FieldValues>();
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="fb_pub_type_id")
	private PublicationType publicationType;
	
	@OneToMany(mappedBy="publicationField", cascade=CascadeType.ALL)
	private Set<FieldType> fieldType = new HashSet<FieldType>();

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<FieldValues> getFieldValues() {
		return fieldValues;
	}

	public void setFieldValues(Set<FieldValues> fieldValues) {
		this.fieldValues = fieldValues;
	}

	public PublicationType getPublicationType() {
		return publicationType;
	}

	public void setPublicationType(PublicationType publicationType) {
		this.publicationType = publicationType;
	}

	public Set<FieldType> getFieldType() {
		return fieldType;
	}

	public void setFieldType(Set<FieldType> fieldType) {
		this.fieldType = fieldType;
	}

}
