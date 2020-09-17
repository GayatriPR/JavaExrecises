package com.training.java;

import com.training.ifaces.RentalAgency;

public class Rent {

	
	public RentalAgency getProduct(int key)
	{
		switch(key)
		{
		case 1:
			return new Computer("Dell Computer", 1000.00, 2, 20);
		case 2:
			return new Furnitures("Sofa", 5000.00, 3, 10);
		default:
			return null;
		}
	}
	
	public void printRent(RentalAgency rent) {
		
		System.out.println(rent.getRent());
	}

	
}
