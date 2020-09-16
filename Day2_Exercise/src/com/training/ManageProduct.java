package com.training;

public class ManageProduct {
	
	//Example for if-else condition
	public double calculateDiscount(Product product) {
		
		double discount = 0.0;
		
		if(product.getRatePerUnit()>500 && product.getRatePerUnit()<=1000)
		{
			discount=0.10;
		}
		else if(product.getRatePerUnit()>1000)
		{
			discount=0.15;
		}
		
		return discount;
	}
	
	//For-loop
	public void showProducts() {
		for(int i=0;i<10;i++)
		{
			System.out.println("Product");
		}
	}
	
	//switch statement
	public void calculateTax() {
		int productType = 2;
	switch(productType)
		{
		case 1:
			System.out.println("5%");
			break;
					
		case 2:
			System.out.println("10%");
			break;
		case 3:
			System.out.println("15%");
			break;
		default:
			System.out.println("20%");
					
		}
	}
}
