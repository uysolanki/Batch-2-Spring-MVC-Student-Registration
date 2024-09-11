package com.excelr.model;

public class Address {

	private String location;
	private String city;
	private String state;
	
	public Address() {}
	public Address(String location, String city, String state) {
		this.location = location;
		this.city = city;
		this.state = state;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
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
	@Override
	public String toString() {
		return "Address [location=" + location + ", city=" + city + ", state=" + state + "]";
	}
	
	
}