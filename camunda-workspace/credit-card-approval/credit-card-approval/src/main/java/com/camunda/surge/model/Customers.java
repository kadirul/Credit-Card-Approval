package com.camunda.surge.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customers {
	@Id
	private int CustomerID;
	private String firstname;
	private String lastname;
	private int Age;
	private int Score;

	public int getCustomerID() {
		return CustomerID;
	}

	public void setCustomerID(int customerID) {
		CustomerID = customerID;
	}

	public int getAge() {
		return Age;
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

	public void setAge(int age) {
		Age = age;
	}

	public int getScore() {
		return Score;
	}

	public void setScore(int score) {
		Score = score;
	}


	
	

}
