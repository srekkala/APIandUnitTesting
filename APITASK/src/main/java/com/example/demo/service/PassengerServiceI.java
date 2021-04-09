package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Entity.Passenger;

public interface PassengerServiceI {
	
	Passenger addPassenger(Passenger passenger);
	List<Passenger> getAll();
	Optional<Passenger> getPassenger(int passengerId);

}
