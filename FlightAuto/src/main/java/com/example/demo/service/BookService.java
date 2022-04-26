package com.example.demo.service;

import com.example.demo.model.Book;

public interface BookService {
	public Book saveBook(Book book);
	public Book getBookById(int bookId);

}
