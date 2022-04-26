package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Service;

import com.example.demo.model.Flight;
import com.example.demo.reposistory.Flightrepo;
@Service
public class FlightServiceImpl implements FlightService{

     @Autowired
     Flightrepo repo;
     
	@Override
	public Flight saveFlight(Flight flight) {
		// TODO Auto-generated method stub
		return repo.save(flight);
	}

	@Override
	@Query("{'Date' : ?0, 'From' : ?1,'To' : ?2}")
	public List<Flight> findByDateAndFromAndTo(String Date, String From, String To) {
		// TODO Auto-generated method stub
		
		return (List<Flight>) repo.findByDateAndFromAndTo(Date,From,To);
	}

}
