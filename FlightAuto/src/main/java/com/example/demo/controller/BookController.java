package com.example.demo.controller;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.model.User;
import com.example.demo.reposistory.Bookrepo;
import com.example.demo.service.BookIdGeneratorService;
import com.example.demo.service.BookService;

@RestController
@RequestMapping("/book")
@CrossOrigin
public class BookController {
	@Autowired
	private Bookrepo repository;
	
	@Autowired
	private BookIdGeneratorService sequenceGeneratorService;
	
	@Autowired
	private BookService bookservice;
	
	@PostMapping("/add")
	public int saveBook(@RequestBody Book book) {
		book.setId(sequenceGeneratorService.generateSequence(Book.SEQUENCE_NAME));
		int a=0;
		try{
			repository.save(book);		}
		catch(Exception e) {
			a=1;
			
		}
		if(a==1) {
		return 0;
		}
		else 
		
		return book.getId();
		
	}
	@GetMapping("/books/{id}")
	  public Book getUserById(@PathVariable Integer id){
		// System.out.print(id);
	    return bookservice.getBookById(id);
	  }
}
