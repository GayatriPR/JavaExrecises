package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lawyer rajesh = new Lawyer(4949 ,"rajesh khanna","High-court","B.L");
		
		Musician sharma = new Musician(2323, "Umesh sharma" , "Guitar","Allahabad");
	
	Billing bill = new Billing();
	bill.printFees(sharma);
	bill.printFees(rajesh);
	
	}

}
