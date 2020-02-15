package com.surge.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//add anotation Entity and Id to specify this is Entity(Customer) and its Id
@Entity
public class Vendors {
	@Id
	private String vendorname;
	private String firstname;
	private String lastname;
	private Long phone;
	private String email;
	private String address;
	private String city;
	private String state;
	private Long zip;
	private String country;

	

	
	public Vendors() {
		super();
	}

	public Vendors(String vendorname, String firstname, String lastname, Long phone2, String email, String address,
			String city, String state, Long zip, String country) {
		super();
		this.vendorname = vendorname;
		this.firstname = firstname;
		this.lastname = lastname;
		this.phone = phone2;
		this.email = email;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
	}

	public String getVendorname() {
		return vendorname;
	}

	public void setVendorname(String vendorname) {
		this.vendorname = vendorname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Long getZip() {
		return zip;
	}

	public void setZip(Long zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Vendors [vendorname=" + vendorname + ", firstname=" + firstname + ", lastname=" + lastname + ", phone="
				+ phone + ", email=" + email + ", address=" + address + ", city=" + city + ", state=" + state + ", zip="
				+ zip + ", country=" + country + "]";
	}
	
	
	
}
