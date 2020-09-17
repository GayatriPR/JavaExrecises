package com.training.java;

import com.training.ifaces.RentalAgency;

public class Computer implements RentalAgency {

	private String productName;
	private double ratePerDay;
	private int day;
	private int quantity;
	
	public Computer(String productName, double ratePerDay, int day, int quantity) {
		super();
		this.productName = productName;
		this.ratePerDay = ratePerDay;
		this.day = day;
		this.quantity = quantity;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getRatePerDay() {
		return ratePerDay;
	}

	public void setRatePerDay(double ratePerDay) {
		this.ratePerDay = ratePerDay;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public double getRent() {
		// TODO Auto-generated method stub
		double amount = 0.0;
		amount = this.quantity*this.day*this.ratePerDay;
		return amount;
	}
	
 

}
