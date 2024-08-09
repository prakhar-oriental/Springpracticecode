package com.org.tcs.Microdemo.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Address")
public class Address {
 private String addressline;
 private String city;
 private String state;
 private String zipcode;
public Address() {
	super();
}
public Address(String addressline, String city, String state, String zipcode) {
	super();
	this.addressline = addressline;
	this.city = city;
	this.state = state;
	this.zipcode = zipcode;
}
public String getAddressline() {
	return addressline;
}
public void setAddressline(String addressline) {
	this.addressline = addressline;
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
public String getZipcode() {
	return zipcode;
}
public void setZipcode(String zipcode) {
	this.zipcode = zipcode;
}
 
}
