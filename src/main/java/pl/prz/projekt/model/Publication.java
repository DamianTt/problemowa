package pl.prz.projekt.model;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Repository;

@Entity
@Table(name="publication", uniqueConstraints= @UniqueConstraint(columnNames="ID"))
@ManagedBean(name="Publication")
public class Publication implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2516933684980647964L;

	public Publication(){
		
	}
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@NotNull
	private int ID;
	
	@Column(name="title")
	@NotNull
	private String title;
	
	@Column(name="release_date")
	@NotNull
	private Date releaseDate;
	
	@Column(name="accepted")
	private String accepted;
	
	@OneToOne(mappedBy="publication",cascade=CascadeType.ALL)
	private Description description;
	
	@OneToOne(mappedBy="publication",cascade=CascadeType.ALL)
	private Link link;
	
	@OneToMany(mappedBy="publication",cascade=CascadeType.ALL)
	private Set<FieldValues> fieldValues = new HashSet<FieldValues>();
	
	@OneToOne(mappedBy="publication",cascade=CascadeType.ALL)
	private Reminder reminder;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="fk_user_id")
	private User user;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="fk_pub_type_id")
	private PublicationType publicationType;
	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	public Description getDescription(){
		return description;
	}
	
	public void setDescription(Description description){
		this.description=description;
	}
	
	public Link getLink() {
		return link;
	}

	public void setLink(Link link) {
		this.link = link;
	}

	public Reminder getReminder() {
		return reminder;
	}

	public void setReminder(Reminder reminder) {
		this.reminder = reminder;
	}

	public Set<FieldValues> getFieldValues() {
		return fieldValues;
	}

	public void setFieldValues(Set<FieldValues> fieldValues) {
		this.fieldValues = fieldValues;
	}

	public String getAccepted() {
		return accepted;
	}

	public void setAccepted(String accepted) {
		this.accepted = accepted;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public PublicationType getPublicationType() {
		return publicationType;
	}

	public void setPublicationType(PublicationType publicationType) {
		this.publicationType = publicationType;
	}

	@Override
	public String toString(){
		return "id="+ID+", title="+title+", release date="+releaseDate.getTime();
	}

}
