package com.lawencon.ticket.model;

public class Schedule {
	
	private int scheduleId;
	private String date;
	private String time;
	private String from;
	private String to;
	private int price;
	private String name;
	
	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}
	
	public int getScheduleId() {
		return this.scheduleId;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getDate() {
		return this.date;
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
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void setTime(String time) {
		this.time = time;
	}
	
	public String getTime() {
		return this.time;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
