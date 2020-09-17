package com.training.java;

import java.util.Scanner;
import com.training.ifaces.RentalAgency;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Rent homecare = new Rent();
		
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		RentalAgency selected = homecare.getProduct(key);
		
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


