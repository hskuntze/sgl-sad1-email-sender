package br.eb.mil.sgl.emailsender.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contact")
public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long creationUser;
	private Long lastEditionUser;
	private LocalDateTime creationDate;
	private LocalDateTime lastEditionDate;
	private String value;
	private Long contactSuperTypeId;
	private Long contactSubTypeId;
	private String description;
	
	public Contact() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCreationUser() {
		return creationUser;
	}

	public void setCreationUser(Long creationUser) {
		this.creationUser = creationUser;
	}

	public Long getLastEditionUser() {
		return lastEditionUser;
	}

	public void setLastEditionUser(Long lastEditionUser) {
		this.lastEditionUser = lastEditionUser;
	}

	public LocalDateTime getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}

	public LocalDateTime getLastEditionDate() {
		return lastEditionDate;
	}

	public void setLastEditionDate(LocalDateTime lastEditionDate) {
		this.lastEditionDate = lastEditionDate;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Long getContactSuperTypeId() {
		return contactSuperTypeId;
	}

	public void setContactSuperTypeId(Long contactSuperTypeId) {
		this.contactSuperTypeId = contactSuperTypeId;
	}

	public Long getContactSubTypeId() {
		return contactSubTypeId;
	}

	public void setContactSubTypeId(Long contactSubTypeId) {
		this.contactSubTypeId = contactSubTypeId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", creationUser=" + creationUser + ", lastEditionUser=" + lastEditionUser
				+ ", creationDate=" + creationDate + ", lastEditionDate=" + lastEditionDate + ", value=" + value
				+ ", contactSuperTypeId=" + contactSuperTypeId + ", contactSubTypeId=" + contactSubTypeId
				+ ", description=" + description + "]";
	}
}
