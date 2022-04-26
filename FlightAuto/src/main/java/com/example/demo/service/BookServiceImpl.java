package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
import com.example.demo.reposistory.Bookrepo;

@Service
public class BookServiceImpl implements BookService{
@Autowired
 Bookrepo repo;
	@Override
	public Book saveBook(Book book) {
		// TODO Auto-generated method stub
		return repo.save(book);
	}
	@Override
	public Book getBookById(int bookId) {
		// TODO Auto-generated method stub
		return repo.findById(bookId).get();
	}

}
