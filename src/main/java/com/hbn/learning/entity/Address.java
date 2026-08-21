package com.hbn.learning.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;


@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String city, state;
    private int pincode;

    
     public Address() {

    }
    
    public Address(String city, String state, int pincode) {
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

    
    public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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


	public int getPincode() {
		return pincode;
	}


	public void setPincode(int pincode) {
		this.pincode = pincode;
	}


	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}

    
    
   
}