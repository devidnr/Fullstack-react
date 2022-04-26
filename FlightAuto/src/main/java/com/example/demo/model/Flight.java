package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Flight")
public class Flight {
	@Id
    private int id;
    private String flightname;    
	private String date;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	private String from;
	private String to;
	private String cost;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFlightname() {
		return flightname;
	}
	public void setFlightname(String flightname) {
		this.flightname = flightname;
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
		return "Flight [id=" + id + ", flightname=" + flightname + ", date=" + date + ", from=" + from + ", to=" + to
				+ ", cost=" + cost + "]";
	}
	

}
