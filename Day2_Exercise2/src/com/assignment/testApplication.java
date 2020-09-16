package com.assignment;

public class testApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Insurance obj = new Insurance(101, "Gayatri" , 22 , 100.00);
		
		double premiumAmount = obj.calculatePremium();
		System.out.println(premiumAmount);
		
        VehicleInsurances activa = new VehicleInsurances(2, 1, 10000.00);
		
		double Amount = activa.calculatePremium();
		System.out.println(Amount);


	}

}
