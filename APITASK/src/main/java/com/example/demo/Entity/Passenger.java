package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Passenger {

	@Id
	private int passengerId;
	private String passengerName;
	public int getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public Passenger(int passengerId, String passengerName) {
		super();
		this.passengerId = passengerId;
		this.passengerName = passengerName;
	}
	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

