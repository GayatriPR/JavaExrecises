package com.training.example.two;

import com.training.ifaces.Automobile;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ShowRoom saiCars = new NewShowRoom();
		
		int key = Integer.parseInt(args[0]);
		Automobile selected = saiCars.getProduct(key);
		
		if(selected!=null)
		{
		saiCars.printEstimate(selected);
		}
		else
		{
			System.out.println("Invalid choice! Please enter valid values either 1 or 2 or 3");
		}
	}

}
