package ua.forself.entity;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import ua.forself.controller.BaseController;

@Entity
@Table (name = "profile1")
public class Profile extends BaseEntity {


	
	private String namePhoto;
	
	
	@Lob
	@Basic(fetch = FetchType.LAZY)//
	@Column(name = "photo_profile", columnDefinition="Mediumblob") // BLOB - 64 kb
	private byte[] photo;
	
//	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	@JoinColumn(name = "registration_id", nullable = true)
//	private Registration registration;

	
	public Profile () {}
	public String getNamePhoto() {
		return namePhoto;
	}


	public void setNamePhoto(String namePhoto) {
		this.namePhoto = namePhoto;
	}


	public byte[] getPhoto() {
		return photo;
	}


	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	
	
	

	
	
}
