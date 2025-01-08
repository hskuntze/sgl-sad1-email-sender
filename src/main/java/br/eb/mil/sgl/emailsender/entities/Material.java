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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "material")
public class Material {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long omId;
	private Long userId;
	private String serialNumber;
	private Long creationUser;
	private LocalDateTime creationDate;
	private Long lastEditionUser;
	private LocalDateTime lastEditionDate;
	private Integer deleted;
	private Long materialStatusId;
	private Long actualOmId;
	private Double coveredTotal;
	private Double totalUsageHours;
	private Integer replacement;
	private LocalDate dateStartWarranty;
	private Long assetId;
	private Long mainMaterialId;
	private String savisLabel;
	private Integer isSupplyingMaterial;
	private Long directHolder;
	private Long currentFraction;
	private Integer isPreInsert;
	private Integer isLai;
	private Long operationalStatusId;
	private Double value;
	private Double totalUsageHoursLastMaintenance;
	private Double coveredTotalLastMaintenance;
	private Double totalUsageHoursLastConfirmedFailure;
	private Integer materialLocationIsInProvider;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(
			name="material_x_indirect_holder",
			joinColumns = @JoinColumn(name = "MATERIAL_ID"),
			inverseJoinColumns = @JoinColumn(name = "HOLDER_ID")
			)
	private List<User> indirectHolders = new ArrayList<>();
	
	@OneToOne
	@JoinColumn(name = "EQUIPMENT_TYPE")
	private EquipmentType equipmentType;
	
	public Material() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getOmId() {
		return omId;
	}

	public void setOmId(Long omId) {
		this.omId = omId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
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

	public Integer getDeleted() {
		return deleted;
	}

	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}

	public Long getMaterialStatusId() {
		return materialStatusId;
	}

	public void setMaterialStatusId(Long materialStatusId) {
		this.materialStatusId = materialStatusId;
	}

	public Long getActualOmId() {
		return actualOmId;
	}

	public void setActualOmId(Long actualOmId) {
		this.actualOmId = actualOmId;
	}

	public Double getCoveredTotal() {
		return coveredTotal;
	}

	public void setCoveredTotal(Double coveredTotal) {
		this.coveredTotal = coveredTotal;
	}

	public Double getTotalUsageHours() {
		return totalUsageHours;
	}

	public void setTotalUsageHours(Double totalUsageHours) {
		this.totalUsageHours = totalUsageHours;
	}

	public Integer getReplacement() {
		return replacement;
	}

	public void setReplacement(Integer replacement) {
		this.replacement = replacement;
	}

	public LocalDate getDateStartWarranty() {
		return dateStartWarranty;
	}

	public void setDateStartWarranty(LocalDate dateStartWarranty) {
		this.dateStartWarranty = dateStartWarranty;
	}

	public Long getAssetId() {
		return assetId;
	}

	public void setAssetId(Long assetId) {
		this.assetId = assetId;
	}

	public Long getMainMaterialId() {
		return mainMaterialId;
	}

	public void setMainMaterialId(Long mainMaterialId) {
		this.mainMaterialId = mainMaterialId;
	}

	public String getSavisLabel() {
		return savisLabel;
	}

	public void setSavisLabel(String savisLabel) {
		this.savisLabel = savisLabel;
	}

	public Integer getIsSupplyingMaterial() {
		return isSupplyingMaterial;
	}

	public void setIsSupplyingMaterial(Integer isSupplyingMaterial) {
		this.isSupplyingMaterial = isSupplyingMaterial;
	}

	public EquipmentType getEquipmentType() {
		return equipmentType;
	}

	public void setEquipmentType(EquipmentType equipmentType) {
		this.equipmentType = equipmentType;
	}

	public Long getDirectHolder() {
		return directHolder;
	}

	public void setDirectHolder(Long directHolder) {
		this.directHolder = directHolder;
	}

	public Long getCurrentFraction() {
		return currentFraction;
	}

	public void setCurrentFraction(Long currentFraction) {
		this.currentFraction = currentFraction;
	}

	public Integer getIsPreInsert() {
		return isPreInsert;
	}

	public void setIsPreInsert(Integer isPreInsert) {
		this.isPreInsert = isPreInsert;
	}

	public Integer getIsLai() {
		return isLai;
	}

	public void setIsLai(Integer isLai) {
		this.isLai = isLai;
	}

	public Long getOperationalStatusId() {
		return operationalStatusId;
	}

	public void setOperationalStatusId(Long operationalStatusId) {
		this.operationalStatusId = operationalStatusId;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public Double getTotalUsageHoursLastMaintenance() {
		return totalUsageHoursLastMaintenance;
	}

	public void setTotalUsageHoursLastMaintenance(Double totalUsageHoursLastMaintenance) {
		this.totalUsageHoursLastMaintenance = totalUsageHoursLastMaintenance;
	}

	public Double getCoveredTotalLastMaintenance() {
		return coveredTotalLastMaintenance;
	}

	public void setCoveredTotalLastMaintenance(Double coveredTotalLastMaintenance) {
		this.coveredTotalLastMaintenance = coveredTotalLastMaintenance;
	}

	public Double getTotalUsageHoursLastConfirmedFailure() {
		return totalUsageHoursLastConfirmedFailure;
	}

	public void setTotalUsageHoursLastConfirmedFailure(Double totalUsageHoursLastConfirmedFailure) {
		this.totalUsageHoursLastConfirmedFailure = totalUsageHoursLastConfirmedFailure;
	}

	public Integer getMaterialLocationIsInProvider() {
		return materialLocationIsInProvider;
	}

	public void setMaterialLocationIsInProvider(Integer materialLocationIsInProvider) {
		this.materialLocationIsInProvider = materialLocationIsInProvider;
	}

	public List<User> getIndirectHolders() {
		return indirectHolders;
	}

	@Override
	public String toString() {
		return "Material [id=" + id + ", omId=" + omId + ", userId=" + userId + ", serialNumber=" + serialNumber
				+ ", creationUser=" + creationUser + ", creationDate=" + creationDate + ", lastEditionUser="
				+ lastEditionUser + ", lastEditionDate=" + lastEditionDate + ", deleted=" + deleted
				+ ", materialStatusId=" + materialStatusId + ", actualOmId=" + actualOmId + ", coveredTotal="
				+ coveredTotal + ", totalUsageHours=" + totalUsageHours + ", replacement=" + replacement
				+ ", dateStartWarranty=" + dateStartWarranty + ", assetId=" + assetId + ", mainMaterialId="
				+ mainMaterialId + ", savisLabel=" + savisLabel + ", isSupplyingMaterial=" + isSupplyingMaterial
				+ ", equipmentType=" + equipmentType + ", directHolder=" + directHolder + ", currentFraction="
				+ currentFraction + ", isPreInsert=" + isPreInsert + ", isLai=" + isLai + ", operationalStatusId="
				+ operationalStatusId + ", value=" + value + ", totalUsageHoursLastMaintenance="
				+ totalUsageHoursLastMaintenance + ", coveredTotalLastMaintenance=" + coveredTotalLastMaintenance
				+ ", totalUsageHoursLastConfirmedFailure=" + totalUsageHoursLastConfirmedFailure
				+ ", materialLocationIsInProvider=" + materialLocationIsInProvider + "]";
	}
}