package com.training.java;

import com.training.ifaces.RentalAgency;

public class Furnitures implements RentalAgency {

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Sofa";
	}

	@Override
	public int getQuantity() {
		// TODO Auto-generated method stub
		return 30;
	}

	
	@Override
	public int getDays() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public double getRatePerDay() {
		// TODO Auto-generated method stub
		return 5000.00;
	}

	
}
