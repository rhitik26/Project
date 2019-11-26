package com.projectcatrer.modal;



import org.springframework.data.annotation.Id;



public class Catrer {
	@Id
	private String cId;
	private String cName;
	private String cEmail;
	private String cDesc;
	private String cCity;
	private String cAddress;
	private String cPhone;
	private String cZip;
	//@DBRef
	//private List<Foodie> foodie;
	public Catrer(String cId, String cName, String cEmail, String cDesc, String cCity, String cAddress, String cPhone,
			String cZip) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cEmail = cEmail;
		this.cDesc = cDesc;
		this.cCity = cCity;
		this.cAddress = cAddress;
		this.cPhone = cPhone;
		this.cZip = cZip;
	}
	public String getcId() {
		return cId;
	}
	public void setcId(String cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcEmail() {
		return cEmail;
	}
	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}
	public String getcDesc() {
		return cDesc;
	}
	public void setcDesc(String cDesc) {
		this.cDesc = cDesc;
	}
	public String getcCity() {
		return cCity;
	}
	public void setcCity(String cCity) {
		this.cCity = cCity;
	}
	public String getcAddress() {
		return cAddress;
	}
	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}
	public String getcPhone() {
		return cPhone;
	}
	public void setcPhone(String cPhone) {
		this.cPhone = cPhone;
	}
	public String getcZip() {
		return cZip;
	}
	public void setcZip(String cZip) {
		this.cZip = cZip;
	}
	
	
}
