package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product tv = new Product(1010,"LED TV",25000.00,2);
		
		ManageProduct mgp = new ManageProduct();
		
		double discount = mgp.calculateDiscount(tv);
		
		System.out.println("discount is : " + discount);
		
		//for-loop
		//mgp.showProducts();
		
		mgp.calculateTax(tv);

	}

}
