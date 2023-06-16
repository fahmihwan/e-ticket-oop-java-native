package com.lawencon.ticket.model;

public class History {
	
	private String transactionId;
	private int total;
	
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	
	public String getTransactionId() {
		return this.transactionId;
	}
	
	public void setTotal(int total) {
		this.total = total;
	}
	
	public int getTotal() {
		return this.total;
	}
}
