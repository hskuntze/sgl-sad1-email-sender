package br.eb.mil.sgl.emailsender.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "failure")
public class Failure {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long componentFunction;
	private LocalDateTime creationDate;
	private LocalDateTime lastEditionDate;
	private Long creationUser;
	private Long lastEditionUser;
	private Integer deleted;
	private Integer failureCode;
	private String failureEffect;
	private String failureLevel;
	private String failureName;
	private Integer isSisfronMaterial;
	private String materialClass;
	private String repairActions;
	
	public Failure() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getComponentFunction() {
		return componentFunction;
	}

	public void setComponentFunction(Long componentFunction) {
		this.componentFunction = componentFunction;
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

	public Integer getDeleted() {
		return deleted;
	}

	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}

	public Integer getFailureCode() {
		return failureCode;
	}

	public void setFailureCode(Integer failureCode) {
		this.failureCode = failureCode;
	}

	public String getFailureEffect() {
		return failureEffect;
	}

	public void setFailureEffect(String failureEffect) {
		this.failureEffect = failureEffect;
	}

	public String getFailureLevel() {
		return failureLevel;
	}

	public void setFailureLevel(String failureLevel) {
		this.failureLevel = failureLevel;
	}

	public String getFailureName() {
		return failureName;
	}

	public void setFailureName(String failureName) {
		this.failureName = failureName;
	}

	public Integer getIsSisfronMaterial() {
		return isSisfronMaterial;
	}

	public void setIsSisfronMaterial(Integer isSisfronMaterial) {
		this.isSisfronMaterial = isSisfronMaterial;
	}

	public String getMaterialClass() {
		return materialClass;
	}

	public void setMaterialClass(String materialClass) {
		this.materialClass = materialClass;
	}

	public String getRepairActions() {
		return repairActions;
	}

	public void setRepairActions(String repairActions) {
		this.repairActions = repairActions;
	}
}