package com.lawencon.ticket.constant;

public enum VoucherConstant {

	KARTINI("KARTINI",30000),PANCASILA("PANCASILA",40000);
	
	public final String name;
	public final int price;
	
	VoucherConstant(String name, int price){
		this.name = name;
		this.price = price;
	}
}
