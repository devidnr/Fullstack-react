package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Document(collection = "book_sequences")
@Component
public class BookSequence {
	@Id
    private String id;

    private int seq;

	public BookSequence() {
	
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	@Override
	public String toString() {
		return "BookSequence [id=" + id + ", seq=" + seq + "]";
	}
	
    
}
