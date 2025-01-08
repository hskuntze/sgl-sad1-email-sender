package br.eb.mil.sgl.emailsender.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "equipment_type")
public class EquipmentType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String description;
	private String code;
	private String otanCode;
	private String materialClass;
	private String ncm;
	private String partNumber;
	private String model;
	
	public EquipmentType() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getOtanCode() {
		return otanCode;
	}

	public void setOtanCode(String otanCode) {
		this.otanCode = otanCode;
	}

	public String getMaterialClass() {
		return materialClass;
	}

	public void setMaterialClass(String materialClass) {
		this.materialClass = materialClass;
	}

	public String getNcm() {
		return ncm;
	}

	public void setNcm(String ncm) {
		this.ncm = ncm;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "EquipmentType [id=" + id + ", name=" + name + ", description=" + description + ", code=" + code
				+ ", otanCode=" + otanCode + ", materialClass=" + materialClass + ", ncm=" + ncm + ", partNumber="
				+ partNumber + ", model=" + model + "]";
	}
}