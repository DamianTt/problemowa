package pl.prz.projekt.model;

import java.io.Serializable;
import java.util.Date;

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
@Table(name="reminder", uniqueConstraints= @UniqueConstraint(columnNames="ID"))
@ManagedBean(name="Reminder")
public class Reminder implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3729284338663685696L;

	public Reminder(){
		
	}
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@NotNull
	private int ID;
	
	@Column(name="notices")
	private String notices;
	
	@Column(name="rem_date")
	@NotNull
	private Date date;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="fk_pub_id", nullable=false)
	private Publication publication;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNotices() {
		return notices;
	}

	public void setNotices(String notices) {
		this.notices = notices;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public Publication getPublication() {
		return publication;
	}

	public void setPublication(Publication publication) {
		this.publication = publication;
	}

	@Override
	public String toString(){
		return "id="+ID+", notices="+notices+", date="+date.getTime();
	}

}
