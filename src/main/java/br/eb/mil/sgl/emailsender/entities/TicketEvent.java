package br.eb.mil.sgl.emailsender.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ticket_event")
public class TicketEvent {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer deleted;
	private LocalDateTime creationDate;
	private LocalDateTime lastEditionDate;
	private String actionType;
	private String comment;
	private String newStatus;
	private String oldStatus;
	private String type;
	private Long creationUser;
	
	@ManyToOne
	@JoinColumn(name = "TICKET", referencedColumnName = "ID", insertable = false, updatable = false)
	private Ticket ticket;
	private Long confirmedFailure;
	private Long lastEditionUser;
	private Integer isResolvedByCac;
	private String materialOperationalStatus;
	private LocalDateTime technicalVisitDateEnd;
	private LocalDateTime technicalVisitDateStart;
	private Long technicalVisitUser;
	private String postponementRequestSlaUnit;
	private Integer postponementRequestSlaValue;
	private String postponementRequestSystemStableUnit;
	private Integer postponementRequestSystemStableValue;
	private Long postponementRequestEvent;
	private Long postponementRequestRejectEvent;
	private Long postponementRequestOm;
	private Long postponementRequestAcceptEvent;
	private LocalDateTime startDate;
	private LocalDateTime endDate;
	private Double laborCost;
	private String materialValue;
	private String totalValue;
	private Long laborCostCurrency;
	private Long technician;
	private LocalDateTime slaRestartDate;
	private Integer isMaterialReplacementInLai;
	private Long materialReplacement;
	private Long externDistribution;
	private Integer approved;
	private LocalDateTime slaStartDate;
	private Long omHolderWithLai;
	private Long substituteEquipmentType;
	private Long approvalOm;
	private String newEquipmentType;
	private String newSerialNumber;
	private Integer isResolvedByEb;
	private Integer quantityMaterial;
	private LocalDateTime approvalOrRejectionDate;
	private Long approvalOrRejectionUser;
	private Long secondaryExternDistribution;
	
	public TicketEvent() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getDeleted() {
		return deleted;
	}

	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
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

	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getNewStatus() {
		return newStatus;
	}

	public void setNewStatus(String newStatus) {
		this.newStatus = newStatus;
	}

	public String getOldStatus() {
		return oldStatus;
	}

	public void setOldStatus(String oldStatus) {
		this.oldStatus = oldStatus;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getCreationUser() {
		return creationUser;
	}

	public void setCreationUser(Long creationUser) {
		this.creationUser = creationUser;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public Long getConfirmedFailure() {
		return confirmedFailure;
	}

	public void setConfirmedFailure(Long confirmedFailure) {
		this.confirmedFailure = confirmedFailure;
	}

	public Long getLastEditionUser() {
		return lastEditionUser;
	}

	public void setLastEditionUser(Long lastEditionUser) {
		this.lastEditionUser = lastEditionUser;
	}

	public Integer getIsResolvedByCac() {
		return isResolvedByCac;
	}

	public void setIsResolvedByCac(Integer isResolvedByCac) {
		this.isResolvedByCac = isResolvedByCac;
	}

	public String getMaterialOperationalStatus() {
		return materialOperationalStatus;
	}

	public void setMaterialOperationalStatus(String materialOperationalStatus) {
		this.materialOperationalStatus = materialOperationalStatus;
	}

	public LocalDateTime getTechnicalVisitDateEnd() {
		return technicalVisitDateEnd;
	}

	public void setTechnicalVisitDateEnd(LocalDateTime technicalVisitDateEnd) {
		this.technicalVisitDateEnd = technicalVisitDateEnd;
	}

	public LocalDateTime getTechnicalVisitDateStart() {
		return technicalVisitDateStart;
	}

	public void setTechnicalVisitDateStart(LocalDateTime technicalVisitDateStart) {
		this.technicalVisitDateStart = technicalVisitDateStart;
	}

	public Long getTechnicalVisitUser() {
		return technicalVisitUser;
	}

	public void setTechnicalVisitUser(Long technicalVisitUser) {
		this.technicalVisitUser = technicalVisitUser;
	}

	public String getPostponementRequestSlaUnit() {
		return postponementRequestSlaUnit;
	}

	public void setPostponementRequestSlaUnit(String postponementRequestSlaUnit) {
		this.postponementRequestSlaUnit = postponementRequestSlaUnit;
	}

	public Integer getPostponementRequestSlaValue() {
		return postponementRequestSlaValue;
	}

	public void setPostponementRequestSlaValue(Integer postponementRequestSlaValue) {
		this.postponementRequestSlaValue = postponementRequestSlaValue;
	}

	public String getPostponementRequestSystemStableUnit() {
		return postponementRequestSystemStableUnit;
	}

	public void setPostponementRequestSystemStableUnit(String postponementRequestSystemStableUnit) {
		this.postponementRequestSystemStableUnit = postponementRequestSystemStableUnit;
	}

	public Integer getPostponementRequestSystemStableValue() {
		return postponementRequestSystemStableValue;
	}

	public void setPostponementRequestSystemStableValue(Integer postponementRequestSystemStableValue) {
		this.postponementRequestSystemStableValue = postponementRequestSystemStableValue;
	}

	public Long getPostponementRequestEvent() {
		return postponementRequestEvent;
	}

	public void setPostponementRequestEvent(Long postponementRequestEvent) {
		this.postponementRequestEvent = postponementRequestEvent;
	}

	public Long getPostponementRequestRejectEvent() {
		return postponementRequestRejectEvent;
	}

	public void setPostponementRequestRejectEvent(Long postponementRequestRejectEvent) {
		this.postponementRequestRejectEvent = postponementRequestRejectEvent;
	}

	public Long getPostponementRequestOm() {
		return postponementRequestOm;
	}

	public void setPostponementRequestOm(Long postponementRequestOm) {
		this.postponementRequestOm = postponementRequestOm;
	}

	public Long getPostponementRequestAcceptEvent() {
		return postponementRequestAcceptEvent;
	}

	public void setPostponementRequestAcceptEvent(Long postponementRequestAcceptEvent) {
		this.postponementRequestAcceptEvent = postponementRequestAcceptEvent;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}

	public Double getLaborCost() {
		return laborCost;
	}

	public void setLaborCost(Double laborCost) {
		this.laborCost = laborCost;
	}

	public String getMaterialValue() {
		return materialValue;
	}

	public void setMaterialValue(String materialValue) {
		this.materialValue = materialValue;
	}

	public String getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(String totalValue) {
		this.totalValue = totalValue;
	}

	public Long getLaborCostCurrency() {
		return laborCostCurrency;
	}

	public void setLaborCostCurrency(Long laborCostCurrency) {
		this.laborCostCurrency = laborCostCurrency;
	}

	public Long getTechnician() {
		return technician;
	}

	public void setTechnician(Long technician) {
		this.technician = technician;
	}

	public LocalDateTime getSlaRestartDate() {
		return slaRestartDate;
	}

	public void setSlaRestartDate(LocalDateTime slaRestartDate) {
		this.slaRestartDate = slaRestartDate;
	}

	public Integer getIsMaterialReplacementInLai() {
		return isMaterialReplacementInLai;
	}

	public void setIsMaterialReplacementInLai(Integer isMaterialReplacementInLai) {
		this.isMaterialReplacementInLai = isMaterialReplacementInLai;
	}

	public Long getMaterialReplacement() {
		return materialReplacement;
	}

	public void setMaterialReplacement(Long materialReplacement) {
		this.materialReplacement = materialReplacement;
	}

	public Long getExternDistribution() {
		return externDistribution;
	}

	public void setExternDistribution(Long externDistribution) {
		this.externDistribution = externDistribution;
	}

	public Integer getApproved() {
		return approved;
	}

	public void setApproved(Integer approved) {
		this.approved = approved;
	}

	public LocalDateTime getSlaStartDate() {
		return slaStartDate;
	}

	public void setSlaStartDate(LocalDateTime slaStartDate) {
		this.slaStartDate = slaStartDate;
	}

	public Long getOmHolderWithLai() {
		return omHolderWithLai;
	}

	public void setOmHolderWithLai(Long omHolderWithLai) {
		this.omHolderWithLai = omHolderWithLai;
	}

	public Long getSubstituteEquipmentType() {
		return substituteEquipmentType;
	}

	public void setSubstituteEquipmentType(Long substituteEquipmentType) {
		this.substituteEquipmentType = substituteEquipmentType;
	}

	public Long getApprovalOm() {
		return approvalOm;
	}

	public void setApprovalOm(Long approvalOm) {
		this.approvalOm = approvalOm;
	}

	public String getNewEquipmentType() {
		return newEquipmentType;
	}

	public void setNewEquipmentType(String newEquipmentType) {
		this.newEquipmentType = newEquipmentType;
	}

	public String getNewSerialNumber() {
		return newSerialNumber;
	}

	public void setNewSerialNumber(String newSerialNumber) {
		this.newSerialNumber = newSerialNumber;
	}

	public Integer getIsResolvedByEb() {
		return isResolvedByEb;
	}

	public void setIsResolvedByEb(Integer isResolvedByEb) {
		this.isResolvedByEb = isResolvedByEb;
	}

	public Integer getQuantityMaterial() {
		return quantityMaterial;
	}

	public void setQuantityMaterial(Integer quantityMaterial) {
		this.quantityMaterial = quantityMaterial;
	}

	public LocalDateTime getApprovalOrRejectionDate() {
		return approvalOrRejectionDate;
	}

	public void setApprovalOrRejectionDate(LocalDateTime approvalOrRejectionDate) {
		this.approvalOrRejectionDate = approvalOrRejectionDate;
	}

	public Long getApprovalOrRejectionUser() {
		return approvalOrRejectionUser;
	}

	public void setApprovalOrRejectionUser(Long approvalOrRejectionUser) {
		this.approvalOrRejectionUser = approvalOrRejectionUser;
	}

	public Long getSecondaryExternDistribution() {
		return secondaryExternDistribution;
	}

	public void setSecondaryExternDistribution(Long secondaryExternDistribution) {
		this.secondaryExternDistribution = secondaryExternDistribution;
	}

	@Override
	public String toString() {
		return "TicketEvent [id=" + id + ", deleted=" + deleted + ", creationDate=" + creationDate
				+ ", lastEditionDate=" + lastEditionDate + ", actionType=" + actionType + ", comment=" + comment
				+ ", newStatus=" + newStatus + ", oldStatus=" + oldStatus + ", type=" + type + ", creationUser="
				+ creationUser + ", ticket=" + ticket + ", confirmedFailure=" + confirmedFailure + ", lastEditionUser="
				+ lastEditionUser + ", isResolvedByCac=" + isResolvedByCac + ", materialOperationalStatus="
				+ materialOperationalStatus + ", technicalVisitDateEnd=" + technicalVisitDateEnd
				+ ", technicalVisitDateStart=" + technicalVisitDateStart + ", technicalVisitUser=" + technicalVisitUser
				+ ", postponementRequestSlaUnit=" + postponementRequestSlaUnit + ", postponementRequestSlaValue="
				+ postponementRequestSlaValue + ", postponementRequestSystemStableUnit="
				+ postponementRequestSystemStableUnit + ", postponementRequestSystemStableValue="
				+ postponementRequestSystemStableValue + ", postponementRequestEvent=" + postponementRequestEvent
				+ ", postponementRequestRejectEvent=" + postponementRequestRejectEvent + ", postponementRequestOm="
				+ postponementRequestOm + ", postponementRequestAcceptEvent=" + postponementRequestAcceptEvent
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", laborCost=" + laborCost + ", materialValue="
				+ materialValue + ", totalValue=" + totalValue + ", laborCostCurrency=" + laborCostCurrency
				+ ", technician=" + technician + ", slaRestartDate=" + slaRestartDate + ", isMaterialReplacementInLai="
				+ isMaterialReplacementInLai + ", materialReplacement=" + materialReplacement + ", externDistribution="
				+ externDistribution + ", approved=" + approved + ", slaStartDate=" + slaStartDate
				+ ", omHolderWithLai=" + omHolderWithLai + ", substituteEquipmentType=" + substituteEquipmentType
				+ ", approvalOm=" + approvalOm + ", newEquipmentType=" + newEquipmentType + ", newSerialNumber="
				+ newSerialNumber + ", isResolvedByEb=" + isResolvedByEb + ", quantityMaterial=" + quantityMaterial
				+ ", approvalOrRejectionDate=" + approvalOrRejectionDate + ", approvalOrRejectionUser="
				+ approvalOrRejectionUser + ", secondaryExternDistribution=" + secondaryExternDistribution + "]";
	}
}
