package com.example.ContactList.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name="contacts")
public class Contacts {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="contactid", nullable=false)
	private Long contactid;
	
	@Column(name="message", nullable=false)
	private String message;
	
	@NotBlank
	@Column(name="contactname", nullable=false)
	private String contactname;
	
	@NotBlank
	@Column(name="email", nullable=false)
	private String email;
	
	@NotBlank
	@Column(name="phone", nullable=false)
	private String phone;
	
	
	public Contacts() {}

	public Contacts(String message, String contactname, String email, String phone) {
		super();
		this.message = message;
		this.contactname = contactname;
		this.email = email;
		this.phone = phone;
	}

	public Long getContactid() {
		return contactid;
	}

	public void setContactid(Long contactid) {
		this.contactid = contactid;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getContactname() {
		return contactname;
	}

	public void setContactname(String contactname) {
		this.contactname = contactname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Contacts [contactid=" + contactid + ", message=" + message + ", contactname=" + contactname + ", email="
				+ email + ", phone=" + phone + "]";
	}

	
}