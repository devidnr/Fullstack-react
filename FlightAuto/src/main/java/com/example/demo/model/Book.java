package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Book")
public class Book {
	@Transient
    public static final String SEQUENCE_NAME = "book_sequence";

    @Id
    private int id;

    private String name;
	private String email;
	private String mobile;
	  private String flightname;    
		private String date;
		private String from;
		private String to;
		private String cost;
		public Book() {
			
		}
		public Book(int id, String name, String email, String mobile, String flightname, String date,
				String from, String to, String cost) {
		
			this.id = id;
			this.name = name;
			this.email = email;
			this.mobile = mobile;
			
			this.flightname = flightname;
			this.date = date;
			this.from = from;
			this.to = to;
			this.cost = cost;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getMobile() {
			return mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		
		public String getFlightname() {
			return flightname;
		}
		public void setFlightname(String flightname) {
			this.flightname = flightname;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public String getFrom() {
			return from;
		}
		public void setFrom(String from) {
			this.from = from;
		}
		public String getTo() {
			return to;
		}
		public void setTo(String to) {
			this.to = to;
		}
		public String getCost() {
			return cost;
		}
		public void setCost(String cost) {
			this.cost = cost;
		}
		@Override
		public String toString() {
			return "Book [id=" + id + ", name=" + name + ", email=" + email + ", mobile=" + mobile
					 + ", flightname=" + flightname + ", date=" + date + ", from=" + from + ", to=" + to
					+ ", cost=" + cost + "]";
		}
		
		
}
