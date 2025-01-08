package br.eb.mil.sgl.emailsender.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer enabled;
	private String cpfNum;
	private String identityNum;
	private String passportCod;
	private String nicknameName;
	private String address;
	private Long omActualSicomId;
	private Long providerId;
	private LocalDate dateStartOm;
	private String identityMilitaryNum;
	private String rankMilitaryName;
	private String currentSituationInd;
	private Integer systemAccess;
	private String userTypeCod;
	private Integer hierarchyCod;
	private String name;
	private String complement;
	private String neighborhood;
	private String zipCode;
	private String passwordHash;
	private Long cityId;
	private Long countryId;
	private Long creationUser;
	private LocalDateTime creationDate;
	private Long lastEditionUser;
	private LocalDateTime lastEditionDate;
	private Long lastProfileUsed;
	private Integer firstAccess;
	private Integer deleted;
	private Long stateId;
	private Long functionId;
	private LocalDate dateFinishOm;
	private String organizationType;
	private String nationality;
	private Long fractionId;
	private Integer countLogin;
	private LocalDate dateLastchangepass;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(
			name = "user_x_contact",
			joinColumns = @JoinColumn(name = "USER_ID"),
			inverseJoinColumns = @JoinColumn(name = "CONTACT_ID")
			)
	private List<Contact> contacts = new ArrayList<>();
	
	public User() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getEnabled() {
		return enabled;
	}

	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}

	public String getCpfNum() {
		return cpfNum;
	}

	public void setCpfNum(String cpfNum) {
		this.cpfNum = cpfNum;
	}

	public String getIdentityNum() {
		return identityNum;
	}

	public void setIdentityNum(String identityNum) {
		this.identityNum = identityNum;
	}

	public String getPassportCod() {
		return passportCod;
	}

	public void setPassportCod(String passportCod) {
		this.passportCod = passportCod;
	}

	public String getNicknameName() {
		return nicknameName;
	}

	public void setNicknameName(String nicknameName) {
		this.nicknameName = nicknameName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getOmActualSicomId() {
		return omActualSicomId;
	}

	public void setOmActualSicomId(Long omActualSicomId) {
		this.omActualSicomId = omActualSicomId;
	}

	public Long getProviderId() {
		return providerId;
	}

	public void setProviderId(Long providerId) {
		this.providerId = providerId;
	}

	public LocalDate getDateStartOm() {
		return dateStartOm;
	}

	public void setDateStartOm(LocalDate dateStartOm) {
		this.dateStartOm = dateStartOm;
	}

	public String getIdentityMilitaryNum() {
		return identityMilitaryNum;
	}

	public void setIdentityMilitaryNum(String identityMilitaryNum) {
		this.identityMilitaryNum = identityMilitaryNum;
	}

	public String getRankMilitaryName() {
		return rankMilitaryName;
	}

	public void setRankMilitaryName(String rankMilitaryName) {
		this.rankMilitaryName = rankMilitaryName;
	}

	public String getCurrentSituationInd() {
		return currentSituationInd;
	}

	public void setCurrentSituationInd(String currentSituationInd) {
		this.currentSituationInd = currentSituationInd;
	}

	public Integer getSystemAccess() {
		return systemAccess;
	}

	public void setSystemAccess(Integer systemAccess) {
		this.systemAccess = systemAccess;
	}

	public String getUserTypeCod() {
		return userTypeCod;
	}

	public void setUserTypeCod(String userTypeCod) {
		this.userTypeCod = userTypeCod;
	}

	public Integer getHierarchyCod() {
		return hierarchyCod;
	}

	public void setHierarchyCod(Integer hierarchyCod) {
		this.hierarchyCod = hierarchyCod;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getPasswordHash() {
		return passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	public Long getCityId() {
		return cityId;
	}

	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}

	public Long getCountryId() {
		return countryId;
	}

	public void setCountryId(Long countryId) {
		this.countryId = countryId;
	}

	public Long getCreationUser() {
		return creationUser;
	}

	public void setCreationUser(Long creationUser) {
		this.creationUser = creationUser;
	}

	public LocalDateTime getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}

	public Long getLastEditionUser() {
		return lastEditionUser;
	}

	public void setLastEditionUser(Long lastEditionUser) {
		this.lastEditionUser = lastEditionUser;
	}

	public LocalDateTime getLastEditionDate() {
		return lastEditionDate;
	}

	public void setLastEditionDate(LocalDateTime lastEditionDate) {
		this.lastEditionDate = lastEditionDate;
	}

	public Long getLastProfileUsed() {
		return lastProfileUsed;
	}

	public void setLastProfileUsed(Long lastProfileUsed) {
		this.lastProfileUsed = lastProfileUsed;
	}

	public Integer getFirstAccess() {
		return firstAccess;
	}

	public void setFirstAccess(Integer firstAccess) {
		this.firstAccess = firstAccess;
	}

	public Integer getDeleted() {
		return deleted;
	}

	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}

	public Long getStateId() {
		return stateId;
	}

	public void setStateId(Long stateId) {
		this.stateId = stateId;
	}

	public Long getFunctionId() {
		return functionId;
	}

	public void setFunctionId(Long functionId) {
		this.functionId = functionId;
	}

	public LocalDate getDateFinishOm() {
		return dateFinishOm;
	}

	public void setDateFinishOm(LocalDate dateFinishOm) {
		this.dateFinishOm = dateFinishOm;
	}

	public String getOrganizationType() {
		return organizationType;
	}

	public void setOrganizationType(String organizationType) {
		this.organizationType = organizationType;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Long getFractionId() {
		return fractionId;
	}

	public void setFractionId(Long fractionId) {
		this.fractionId = fractionId;
	}

	public Integer getCountLogin() {
		return countLogin;
	}

	public void setCountLogin(Integer countLogin) {
		this.countLogin = countLogin;
	}

	public LocalDate getDateLastchangepass() {
		return dateLastchangepass;
	}

	public void setDateLastchangepass(LocalDate dateLastchangepass) {
		this.dateLastchangepass = dateLastchangepass;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", enabled=" + enabled + ", cpfNum=" + cpfNum + ", identityNum=" + identityNum
				+ ", passportCod=" + passportCod + ", nicknameName=" + nicknameName + ", address=" + address
				+ ", omActualSicomId=" + omActualSicomId + ", providerId=" + providerId + ", dateStartOm=" + dateStartOm
				+ ", identityMilitaryNum=" + identityMilitaryNum + ", rankMilitaryName=" + rankMilitaryName
				+ ", currentSituationInd=" + currentSituationInd + ", systemAccess=" + systemAccess + ", userTypeCod="
				+ userTypeCod + ", hierarchyCod=" + hierarchyCod + ", name=" + name + ", complement=" + complement
				+ ", neighborhood=" + neighborhood + ", zipCode=" + zipCode + ", passwordHash=" + passwordHash
				+ ", cityId=" + cityId + ", countryId=" + countryId + ", creationUser=" + creationUser
				+ ", creationDate=" + creationDate + ", lastEditionUser=" + lastEditionUser + ", lastEditionDate="
				+ lastEditionDate + ", lastProfileUsed=" + lastProfileUsed + ", firstAccess=" + firstAccess
				+ ", deleted=" + deleted + ", stateId=" + stateId + ", functionId=" + functionId + ", dateFinishOm="
				+ dateFinishOm + ", organizationType=" + organizationType + ", nationality=" + nationality
				+ ", fractionId=" + fractionId + ", countLogin=" + countLogin + ", dateLastchangepass="
				+ dateLastchangepass + "]";
	}
}
