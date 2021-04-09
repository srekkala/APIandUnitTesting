package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Passenger;
import com.example.demo.repository.PassengerRepository;

@Service
@Transactional
public class PassengerServiceImpl implements PassengerServiceI {

	@Autowired
	PassengerRepository repo;
	
	@Override
	public Passenger addPassenger(Passenger passenger) {
		return repo.save(passenger);
	}

	@Override
	public List<Passenger> getAll() {
		return repo.findAll();
	}

	@Override
	public Optional<Passenger> getPassenger(int passengerId) {
		return repo.findById(passengerId);
	}
}
