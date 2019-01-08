/*
 * Developed by sintu
 * POJO Class for User Address
 * 
 */


package com.journaldev.spring.model;

public class Address{
	
	public String city;
	public String state;
	public int pin;
	
	public String country;
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
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
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	
}