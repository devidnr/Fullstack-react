package com.example.demo.reposistory;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Flight;

@Repository
public interface Flightrepo  extends MongoRepository<Flight,Integer>{

	//Object findByDateAndFromAndTo(String date, String from, String to);

	List<Flight> findBy(String date, String from, String to);

	List<Flight> findByDateAndFromAndTo(String date, String from, String to);

}
