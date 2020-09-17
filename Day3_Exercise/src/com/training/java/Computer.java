package com.training.java;

import com.training.ifaces.RentalAgency;

public class Computer implements RentalAgency {

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Dell";
	}

	@Override
	public int getQuantity() {
		// TODO Auto-generated method stub
		return 20;
	}

	
	@Override
	public int getDays() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public double getRatePerDay() {
		// TODO Auto-generated method stub
		return 1000.00;
	}


}
