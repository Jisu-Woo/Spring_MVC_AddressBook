package com.example.demo;

import java.util.UUID;

public class Address {
	private UUID id;
	private String firstName;
	private String lastName;
	private String address;
	private String email;
	
	//constructor
	Address(UUID id, String fname, String lname, String address, String email){
		this.id = id;
		this.firstName = fname;
		this.lastName = lname;
		this.address = address;
		this.email = email;
	}
	
	
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
