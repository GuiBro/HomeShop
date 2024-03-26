package com.cursan.homeshop;

public class Customer {
	private String fullname;
	private String Address;
	
	public Customer (String fullname, String address) {
		this.fullname = fullname;
		this.Address = address;
	}
	
	public String getFullname() {
		return fullname;
	}
	public String getAddress() {
		return Address;
	}
	
	
}
