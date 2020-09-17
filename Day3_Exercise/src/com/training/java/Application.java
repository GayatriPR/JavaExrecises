package com.training.java;
import com.training.ifaces.RentalAgency;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rent homecare = new Rent();
		
		int key = Integer.parseInt(args[0]);
		RentalAgency selected = homecare.getRent(key);
		
		if(selected!=null)
		{
		homecare.printRent(selected);
		}
		else
		{
			System.out.println("Invalid choice! Please enter valid values either 1 or 2 or 3");
		}
	}

}
