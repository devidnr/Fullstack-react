package com.example.demo.reposistory;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Book;

@Repository
public interface Bookrepo  extends MongoRepository<Book,Integer>{

}
