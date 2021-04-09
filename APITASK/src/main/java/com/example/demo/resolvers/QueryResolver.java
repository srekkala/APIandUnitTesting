package com.example.demo.resolvers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.demo.Entity.Flight;
import com.example.demo.service.FlightServiceI;

@Component
public class QueryResolver implements GraphQLQueryResolver{

	@Autowired 
	FlightServiceI service;
	
	public List<Flight> getAllFlights(){
		return service.getAllFlights();
	}
	
	public Optional<Flight> getFlight(int id){
		return service.getFlightById(id);
	}
	
}