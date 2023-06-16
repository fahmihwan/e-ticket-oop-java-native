package com.lawencon.ticket.model;

public class Order {
	
	private String chairNum;
	private String from;
	private String to;
	private String date;
	private int price;
	private String transport;
	private String random;
	private String dateNow;
	
	public void setChairNum(String chairNum) {
		this.chairNum =  chairNum;
	}
	
	public String getChairNum() {
		return this.chairNum;
	}
	
	public void setFrom(String from) {
		this.from = from;
	}
	
	public String getFrom() {
		return this.from;
	}
	
	public void setTo(String to) {
		this.to = to;
	}
	
	public String getTo() {
		return this.to;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getDate() {
		return this.date;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void setTransport(String transport) {
		this.transport = transport;
	}
	
	public String getTransport() {
		return transport;
	}
	
	public void setRandom(String random) {
		this.random = random;
	}
	
	public String getRandom() {
		return this.random;
	}
	
	public void setDateNow(String dateNow) {
		this.dateNow = dateNow;
	}
	
	public String getDateNow() {
		return this.dateNow;
	}
		
}
