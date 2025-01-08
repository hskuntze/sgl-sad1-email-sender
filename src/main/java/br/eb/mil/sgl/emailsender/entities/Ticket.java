package br.eb.mil.sgl.emailsender.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ticket")
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer deleted;
	private LocalDate creationDate;
	private LocalDate lastEditionDate;
	private String beanIdentifier;
	private LocalDate failureDate;
	private String failureDescription;
	private Integer isMaterialOutsideOm;
	private Integer isMissionOutsideOm;
	private Integer isResolvedByCac;
	private Integer isTiMaterial;
	private Double latitude;
	private Double longitude;
	private String localDescription;
	private String materialOperationalStatus;
	private Integer seqNumberInYear;
	private String ticketStatus;
	private Long omRequester;
	
	@ManyToOne
	@JoinColumn(name = "USER_REQUESTER", referencedColumnName = "ID", insertable = false, updatable = false)
	private User userRequester;
	private Long originalFailure;
	private Long creationUser;
	private Long material;
	private Long lastEditionUser;
	private Long confirmedFailure;
	private String contactOutsideOm;
	private Long userHolder;
	private Long omHolder;
	private Integer isResolvedByEb;
	private Integer isInfoviaTicket;
	private Long infoviaSite;
	private String ticketType;
	private Long responsibleOm;
	private LocalDate openingDate;
	private String auditoriachamado;
	private String parecercontratada;
	private String auditoriaparecer;
	private String observacao;
	private String solicitacaoconsorcio;
	
	public Ticket() {
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

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

	public LocalDate getLastEditionDate() {
		return lastEditionDate;
	}

	public void setLastEditionDate(LocalDate lastEditionDate) {
		this.lastEditionDate = lastEditionDate;
	}

	public String getBeanIdentifier() {
		return beanIdentifier;
	}

	public void setBeanIdentifier(String beanIdentifier) {
		this.beanIdentifier = beanIdentifier;
	}

	public LocalDate getFailureDate() {
		return failureDate;
	}

	public void setFailureDate(LocalDate failureDate) {
		this.failureDate = failureDate;
	}

	public String getFailureDescription() {
		return failureDescription;
	}

	public void setFailureDescription(String failureDescription) {
		this.failureDescription = failureDescription;
	}

	public Integer getIsMaterialOutsideOm() {
		return isMaterialOutsideOm;
	}

	public void setIsMaterialOutsideOm(Integer isMaterialOutsideOm) {
		this.isMaterialOutsideOm = isMaterialOutsideOm;
	}

	public Integer getIsMissionOutsideOm() {
		return isMissionOutsideOm;
	}

	public void setIsMissionOutsideOm(Integer isMissionOutsideOm) {
		this.isMissionOutsideOm = isMissionOutsideOm;
	}

	public Integer getIsResolvedByCac() {
		return isResolvedByCac;
	}

	public void setIsResolvedByCac(Integer isResolvedByCac) {
		this.isResolvedByCac = isResolvedByCac;
	}

	public Integer getIsTiMaterial() {
		return isTiMaterial;
	}

	public void setIsTiMaterial(Integer isTiMaterial) {
		this.isTiMaterial = isTiMaterial;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public String getLocalDescription() {
		return localDescription;
	}

	public void setLocalDescription(String localDescription) {
		this.localDescription = localDescription;
	}

	public String getMaterialOperationalStatus() {
		return materialOperationalStatus;
	}

	public void setMaterialOperationalStatus(String materialOperationalStatus) {
		this.materialOperationalStatus = materialOperationalStatus;
	}

	public Integer getSeqNumberInYear() {
		return seqNumberInYear;
	}

	public void setSeqNumberInYear(Integer seqNumberInYear) {
		this.seqNumberInYear = seqNumberInYear;
	}

	public String getTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	public Long getOmRequester() {
		return omRequester;
	}

	public void setOmRequester(Long omRequester) {
		this.omRequester = omRequester;
	}

	public User getUserRequester() {
		return userRequester;
	}

	public void setUserRequester(User userRequester) {
		this.userRequester = userRequester;
	}

	public Long getOriginalFailure() {
		return originalFailure;
	}

	public void setOriginalFailure(Long originalFailure) {
		this.originalFailure = originalFailure;
	}

	public Long getCreationUser() {
		return creationUser;
	}

	public void setCreationUser(Long creationUser) {
		this.creationUser = creationUser;
	}

	public Long getMaterial() {
		return material;
	}

	public void setMaterial(Long material) {
		this.material = material;
	}

	public Long getLastEditionUser() {
		return lastEditionUser;
	}

	public void setLastEditionUser(Long lastEditionUser) {
		this.lastEditionUser = lastEditionUser;
	}

	public Long getConfirmedFailure() {
		return confirmedFailure;
	}

	public void setConfirmedFailure(Long confirmedFailure) {
		this.confirmedFailure = confirmedFailure;
	}

	public String getContactOutsideOm() {
		return contactOutsideOm;
	}

	public void setContactOutsideOm(String contactOutsideOm) {
		this.contactOutsideOm = contactOutsideOm;
	}

	public Long getUserHolder() {
		return userHolder;
	}

	public void setUserHolder(Long userHolder) {
		this.userHolder = userHolder;
	}

	public Long getOmHolder() {
		return omHolder;
	}

	public void setOmHolder(Long omHolder) {
		this.omHolder = omHolder;
	}

	public Integer getIsResolvedByEb() {
		return isResolvedByEb;
	}

	public void setIsResolvedByEb(Integer isResolvedByEb) {
		this.isResolvedByEb = isResolvedByEb;
	}

	public Integer getIsInfoviaTicket() {
		return isInfoviaTicket;
	}

	public void setIsInfoviaTicket(Integer isInfoviaTicket) {
		this.isInfoviaTicket = isInfoviaTicket;
	}

	public Long getInfoviaSite() {
		return infoviaSite;
	}

	public void setInfoviaSite(Long infoviaSite) {
		this.infoviaSite = infoviaSite;
	}

	public String getTicketType() {
		return ticketType;
	}

	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}

	public Long getResponsibleOm() {
		return responsibleOm;
	}

	public void setResponsibleOm(Long responsibleOm) {
		this.responsibleOm = responsibleOm;
	}

	public LocalDate getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(LocalDate openingDate) {
		this.openingDate = openingDate;
	}

	public String getAuditoriachamado() {
		return auditoriachamado;
	}

	public void setAuditoriachamado(String auditoriachamado) {
		this.auditoriachamado = auditoriachamado;
	}

	public String getParecercontratada() {
		return parecercontratada;
	}

	public void setParecercontratada(String parecercontratada) {
		this.parecercontratada = parecercontratada;
	}

	public String getAuditoriaparecer() {
		return auditoriaparecer;
	}

	public void setAuditoriaparecer(String auditoriaparecer) {
		this.auditoriaparecer = auditoriaparecer;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getSolicitacaoconsorcio() {
		return solicitacaoconsorcio;
	}

	public void setSolicitacaoconsorcio(String solicitacaoconsorcio) {
		this.solicitacaoconsorcio = solicitacaoconsorcio;
	}

	@Override
	public String toString() {
		return "Ticket [id=" + id + ", deleted=" + deleted + ", creationDate=" + creationDate + ", lastEditionDate="
				+ lastEditionDate + ", beanIdentifier=" + beanIdentifier + ", failureDate=" + failureDate
				+ ", failureDescription=" + failureDescription + ", isMaterialOutsideOm=" + isMaterialOutsideOm
				+ ", isMissionOutsideOm=" + isMissionOutsideOm + ", isResolvedByCac=" + isResolvedByCac
				+ ", isTiMaterial=" + isTiMaterial + ", latitude=" + latitude + ", longitude=" + longitude
				+ ", localDescription=" + localDescription + ", materialOperationalStatus=" + materialOperationalStatus
				+ ", seqNumberInYear=" + seqNumberInYear + ", ticketStatus=" + ticketStatus + ", omRequester="
				+ omRequester + ", userRequester=" + userRequester + ", originalFailure=" + originalFailure
				+ ", creationUser=" + creationUser + ", material=" + material + ", lastEditionUser=" + lastEditionUser
				+ ", confirmedFailure=" + confirmedFailure + ", contactOutsideOm=" + contactOutsideOm + ", userHolder="
				+ userHolder + ", omHolder=" + omHolder + ", isResolvedByEb=" + isResolvedByEb + ", isInfoviaTicket="
				+ isInfoviaTicket + ", infoviaSite=" + infoviaSite + ", ticketType=" + ticketType + ", responsibleOm="
				+ responsibleOm + ", openingDate=" + openingDate + ", auditoriachamado=" + auditoriachamado
				+ ", parecercontratada=" + parecercontratada + ", auditoriaparecer=" + auditoriaparecer
				+ ", observacao=" + observacao + ", solicitacaoconsorcio=" + solicitacaoconsorcio + "]";
	}
}
