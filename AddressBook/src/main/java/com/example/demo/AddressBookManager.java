package com.example.demo;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.stereotype.Component;

@Component
public class AddressBookManager implements IAddressBookManager {
	
	public ArrayList<Address> list = new ArrayList<Address>();

	@Override
	public boolean addAddress(String fname, String lname, String address, String email) {
		//email unique check
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getEmail().equals(email)) {
				return false;
			}
		}

		UUID uid = UUID.fromString("38400000-8cf0-11bd-b23e-10b96e4ef00d");
		boolean isEqual = false;
		do {
			isEqual = false;
			UUID uuid = UUID.randomUUID();
			for(int i = 0; i < list.size(); i++) {
				if(list.get(i).getId().equals(uuid)) {
					isEqual = true;
				}
			}
			if(!(isEqual)) {
				uid = uuid;
				break;
			}
		} while(isEqual);
				
		
		Address a = new Address(uid, fname, lname, address, email);		
		list.add(a);
		return true;

	}

	@Override
	public Address emailToAddress(String email) { 
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getEmail().equals(email)) {
				return list.get(i);
				//email은 unique해서 only one return
			}
		}
		// TODO Auto-generated method stub
		// 없으면 null 
		return null;
	}

	@Override
	public ArrayList<Address> lastToAddress(String lastName) {
		ArrayList<Address> a = new ArrayList<Address> ();
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getLastName().equals(lastName)) {
				
				a.add(list.get(i));
			}
		}
		//일치하는 lastName을 가진 Address list를 만들어서 return
		return a;
		
		// TODO Auto-generated method stub
	}

	@Override
	public ArrayList<Address> allAddress() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public boolean remove(String email) {
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getEmail().equals(email)) {
				list.remove(i);

				return true;
			}
		}
		//동일 email 존재X
		return false;
		
	}

	@Override
	public boolean removeAll() {
		list.clear();
		// TODO Auto-generated method stub
		return true;
	}


	
	
}
