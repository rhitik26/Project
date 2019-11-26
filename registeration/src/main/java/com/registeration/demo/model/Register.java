package com.registeration.demo.model;

import org.springframework.data.annotation.Id;

public class Register {
	@Id
	private String id;
	private String name;
	private String uname;
	private String pass;
	private String cpass;
	private String email;
	private String phone;
	private String tp;
	private String add1;
	private String add2;
	private String add3;
	private String city;
	private String zip;
	public Register(String id, String name, String uname, String pass, String cpass, String email, String phone, String tp,
			String add1, String add2, String add3, String city, String zip) {
		super();
		this.id = id;
		this.name = name;
		this.uname = uname;
		this.pass = pass;
		this.cpass = cpass;
		this.email = email;
		this.phone = phone;
		this.tp = tp;
		this.add1 = add1;
		this.add2 = add2;
		this.add3 = add3;
		this.city = city;
		this.zip = zip;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getCpass() {
		return cpass;
	}
	public void setCpass(String cpass) {
		this.cpass = cpass;
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
	public String getTp() {
		return tp;
	}
	public void setTp(String tp) {
		this.tp = tp;
	}
	public String getAdd1() {
		return add1;
	}
	public void setAdd1(String add1) {
		this.add1 = add1;
	}
	public String getAdd2() {
		return add2;
	}
	public void setAdd2(String add2) {
		this.add2 = add2;
	}
	public String getAdd3() {
		return add3;
	}
	public void setAdd3(String add3) {
		this.add3 = add3;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	

}
