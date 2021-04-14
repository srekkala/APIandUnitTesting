package com.example.demo.resolvers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.demo.Entity.Passenger;
import com.example.demo.service.PassengerServiceI;



@Component
public class PassengerQueryResolver implements GraphQLQueryResolver{

	@Autowired
	PassengerServiceI service;
	
	public List<Passenger> getAllPassengers(){
		return service.getAll();
	}
	
	public Optional<Passenger> getPassengerById(int passengerId){
		return service.getPassenger(passengerId);
	}
	
}
