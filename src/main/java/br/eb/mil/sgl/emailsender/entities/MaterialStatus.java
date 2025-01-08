package br.eb.mil.sgl.emailsender.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "material_status")
public class MaterialStatus {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String status;
	private Integer canEdit;
	private Integer canDisable;
	private Long creationUser;
	private LocalDate creationDate;
	private Long lastEditionUser;
	private LocalDate lastEditionDate;
	private Integer deleted;
	
	public MaterialStatus() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getCanEdit() {
		return canEdit;
	}

	public void setCanEdit(Integer canEdit) {
		this.canEdit = canEdit;
	}

	public Integer getCanDisable() {
		return canDisable;
	}

	public void setCanDisable(Integer canDisable) {
		this.canDisable = canDisable;
	}

	public Long getCreationUser() {
		return creationUser;
	}

	public void setCreationUser(Long creationUser) {
		this.creationUser = creationUser;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

	public Long getLastEditionUser() {
		return lastEditionUser;
	}

	public void setLastEditionUser(Long lastEditionUser) {
		this.lastEditionUser = lastEditionUser;
	}

	public LocalDate getLastEditionDate() {
		return lastEditionDate;
	}

	public void setLastEditionDate(LocalDate lastEditionDate) {
		this.lastEditionDate = lastEditionDate;
	}

	public Integer getDeleted() {
		return deleted;
	}

	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}

	@Override
	public String toString() {
		return "MaterialStatus [id=" + id + ", status=" + status + ", canEdit=" + canEdit + ", canDisable=" + canDisable
				+ ", creationUser=" + creationUser + ", creationDate=" + creationDate + ", lastEditionUser="
				+ lastEditionUser + ", lastEditionDate=" + lastEditionDate + ", deleted=" + deleted + "]";
	}
}