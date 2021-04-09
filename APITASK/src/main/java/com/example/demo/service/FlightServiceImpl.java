package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Flight;
import com.example.demo.repository.FlightRepository;

@Service
@Transactional
public class FlightServiceImpl implements FlightServiceI{

	@Autowired
	FlightRepository flightRepo;
		/*
		 * Function Name : addFlight
		 * Input Parameters : Flight flight
		 * Return Type : Flight 
		 * Description : Adding flights
		 */
		@Override
		public Flight addFlight(Flight flight) {
			return flightRepo.save(flight);
		}
		
		/*
		 * Function Name : deleteFlight
		 * Input Parameters : String flightId
		 * Return Type : String 
		 * Description : Deleting flight based on flilghtId if exists
		 */
		@Override
		public String deleteFlight(int id) {
			//Flight isExist = flightRepo.findById(id);
//			if(isExist!=null) {
				flightRepo.deleteById(id);
				return "Flight with id:" +id+ "deleted succesfully!";
//			}
//			else {
//				throw new FlightNotFoundException("FlightId with"+id+"not found!");
//			}
		}

		
		/*
		 * Function Name : getAllFlights
		 * Return Type : List<Flight> 
		 * Description : Retrieving all existing flights 
		 */
		@Override
		public List<Flight> getAllFlights() {
			return flightRepo.findAll();
		}

		/*
		 * Function Name : updateFlight
		 * Input Parameters : int id, int seatcapacity
		 * Return Type : Flight 
		 * Description : Updating existing flight 
		 */
		@Override
		public Flight updateseatCapacity(int id, int seatCapacity) {
//			if(flightRepo.findById(id) != null) {
				Flight flightRes=flightRepo.findById(id).get();
				flightRes.setSeatCapacity(seatCapacity);
				flightRepo.save(flightRes);
				return flightRes;
//				}
//				else {
//					throw new FlightNotFoundException("FlightId with"+id+"not found!");
//				}
		}

		@Override
		public Optional<Flight> getFlightById(int id) {
			return flightRepo.findById(id);
		}
}


