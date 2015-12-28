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
@Table(name="user", uniqueConstraints={ @UniqueConstraint(columnNames="ID"),
		@UniqueConstraint(columnNames="email")})
@ManagedBean(name="user")
public class User implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2593528172324567631L;

	public User() {
	}
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@NotNull
	private int ID;
	
	@Column(name="firstname")
	@NotNull
	private String firstName;
	
	@Column(name="lastname")
	@NotNull
	private String lastName;

	@Column(name="password")
	@NotNull
	private String password;
	
	@Column(name="email")
	@NotNull
	private String email;
	
	@Column(name="admin")
	@NotNull
	private String admin;
	
	@Column(name="phone")
	@NotNull
	private String phone;
	
	@OneToMany(mappedBy="user", cascade=CascadeType.ALL)
	private Set<Publication> publication = new HashSet<Publication>();

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdmin() {
		return admin;
	}

	public void setAdmin(String admin) {
		this.admin = admin;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Set<Publication> getPublication() {
		return publication;
	}

	public void setPublication(Set<Publication> publication) {
		this.publication = publication;
	}
	
}
