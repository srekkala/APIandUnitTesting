package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Entity.Flight;

public interface FlightServiceI {
	 Flight addFlight(Flight flight);
	 String deleteFlight(int id);
	 List<Flight> getAllFlights();
	 Optional<Flight> getFlightById(int id);
	 Flight updateseatCapacity(int id, int seatCapacity);
}
