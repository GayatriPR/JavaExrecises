package com.training.example.two;

import com.training.ifaces.Automobile;
import java.util.*;


public class Application {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShowRoom saiCars = new NewShowRoom();
		Scanner sc = new Scanner(System.in);
		String choice = sc.next();
		do
		{
			//polymorphism			
			int key = sc.nextInt();
			Automobile selected = saiCars.getProduct(key);
			
			if(selected!=null)
			{
			saiCars.printEstimate(selected);
			}
			else
			{
				System.out.println("Invalid choice! Please enter valid values either 1 or 2 or 3");
			}
		}while(choice.equalsIgnoreCase("yes"));
	
		sc.close();
	}
}
