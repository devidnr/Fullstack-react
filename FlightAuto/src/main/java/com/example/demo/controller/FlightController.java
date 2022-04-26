package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Flight;
import com.example.demo.model.User;
import com.example.demo.reposistory.Flightrepo;
import com.example.demo.service.FlightService;

@RestController
@RequestMapping("/flight")
@CrossOrigin
public class FlightController {

	@Autowired
	private Flightrepo repo;
	@Autowired 
	private FlightService service;
	
	@PostMapping("/add")
	public String saveUser(@RequestBody Flight flight) {
		System.out.print(flight);
	
	repo.save(flight);
	return "flight saved";
	}
	@PostMapping("/check")
	public List<Flight> check(@RequestBody Flight flight) {
		//System.out.print(flight);
    System.out.println(service.findByDateAndFromAndTo(flight.getDate(), flight.getFrom(), flight.getTo()));
	return service.findByDateAndFromAndTo(flight.getDate(), flight.getFrom(), flight.getTo());
		
		
	}
}
