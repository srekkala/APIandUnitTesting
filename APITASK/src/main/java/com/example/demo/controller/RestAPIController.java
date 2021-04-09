package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Flight;
import com.example.demo.Entity.Passenger;
import com.example.demo.service.FlightServiceI;
import com.example.demo.service.PassengerServiceI;

@RestController
public class RestAPIController {
	
	@Autowired 
	FlightServiceI service;
	
	@Autowired
	PassengerServiceI passService;
	
	@PostMapping("/addFlight")
	public Flight add(@RequestBody Flight flight) {
		return service.addFlight(flight);
	}
	
	@PutMapping("/updateFlight")
	public Flight update(@RequestParam int id,@RequestParam int SeatCapacity) {
		return service.updateseatCapacity(id, SeatCapacity);
	}
	
	@DeleteMapping("deleteFlight/{id}")
	public String delete(@PathVariable int id) {
		return service.deleteFlight(id); 
	}
	
	@PostMapping("/addPassenger")
	public Passenger add(@RequestBody Passenger passenger) {
		return passService.addPassenger(passenger);
	}
	
}
