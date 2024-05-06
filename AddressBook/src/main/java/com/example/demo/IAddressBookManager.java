package com.example.demo;

import java.util.ArrayList;

public interface IAddressBookManager {

	public boolean addAddress(String fname, String lname, String address, String email);
	public Address emailToAddress(String email);
	public ArrayList<Address> lastToAddress(String lastName);
	public ArrayList<Address> allAddress();
	public boolean remove(String email);
	public boolean removeAll(); 

}
