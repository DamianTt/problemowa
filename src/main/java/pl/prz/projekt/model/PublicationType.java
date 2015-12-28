package pl.prz.projekt.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.faces.bean.ManagedBean;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="publication_type", uniqueConstraints=@UniqueConstraint(columnNames="type_name"))
@ManagedBean(name="PublicationType")
public class PublicationType implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 42303315485609148L;

	public PublicationType() {
	}
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@NotNull
	private int ID;
	
	@Column(name="type_name")
	@NotNull
	private String typeName;

	
	@OneToMany(mappedBy="publicationType",cascade=CascadeType.ALL)
	private Set<PublicationField> publicationField = new HashSet<PublicationField>();
	

	@OneToMany(mappedBy="publicationType",cascade=CascadeType.ALL)
	private Set<Publication> publication = new HashSet<Publication>();
	
	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public String getTypeName() {
		return typeName;
	}


	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
	public Set<PublicationField> getPublicationField() {
		return publicationField;
	}

	public void setPublicationField(Set<PublicationField> publicationField) {
		this.publicationField = publicationField;
	}

	public Set<Publication> getPublication() {
		return publication;
	}


	public void setPublication(Set<Publication> publication) {
		this.publication = publication;
	}


	@Override
	public String toString(){
		return "id="+ID+", typeName="+typeName;
	}

}
