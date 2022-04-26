package com.example.demo.service;

import java.util.List;

import org.springframework.data.mongodb.repository.Query;

import com.example.demo.model.Flight;
import com.example.demo.model.User;

public interface FlightService {
	public Flight saveFlight(Flight flight);
	public List<Flight> findByDateAndFromAndTo(String Date,String From,String To);
}
