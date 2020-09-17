package com.training.java;

import com.training.ifaces.RentalAgency;

public class Rent {

	
	public RentalAgency getRent(int key)
	{
		switch(key)
		{
		case 1:
			return new Computer();
		case 2:
			return new Furnitures();
		default:
			return null;
		}
	}
	
	public double printRent(RentalAgency polyrent)
	{
		double amount = 0.0;
		amount = amount + (polyrent.getQuantity()* polyrent.getRatePerDay()* polyrent.getDays());
	
		return amount;
	}
}
