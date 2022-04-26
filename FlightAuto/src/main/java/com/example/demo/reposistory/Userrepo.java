package com.example.demo.reposistory;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

@Repository
public interface Userrepo  extends MongoRepository<User,Integer>{
	Optional<User> findByEmail(String email);

}
