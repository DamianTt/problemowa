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
@Table(name="link", uniqueConstraints= @UniqueConstraint(columnNames="ID"))
@ManagedBean(name="Link")
public class Link implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1260925233423342159L;

	public Link() {
		
	}

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@NotNull
	private int ID;
	
	@Column(name="url")
	@NotNull
	private String url;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="fk_pub_id", nullable=false)
	private Publication publication;
	
	public int getID() {
		return ID;
	}
	
	public void setID(int iD) {
		ID = iD;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	
	@Override
	public String toString(){
		return "id="+ID+", url="+url;
	}
	
}
