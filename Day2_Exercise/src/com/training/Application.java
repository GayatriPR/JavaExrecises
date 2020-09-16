package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product tv = new Product(1010,"LED TV",20000.00,2,20,10.00);
		
		ManageProduct mgp = new ManageProduct();
		
		//double discount = mgp.calculateDiscount(tv);
		
		//System.out.println("discount is : " + discount);
		
		Product fridge = new Product();
		fridge.setProductId(1700);
		fridge.setProductName("Fridge");
		fridge.setRatePerUnit(30000.00);
		fridge.setProductType(3);
		fridge.setQuantity(30);
		
		int taxAmount = mgp.calculateTax(tv);
		System.out.println(taxAmount);
		
		
		//creating a array of type product with size 2
		
		Product[] productList= new Product[2];
		
		productList[0]=tv;
		productList[1]=fridge;
		
		
		mgp.calculateDiscount(productList);
		
        mgp.showProductsLegacy(productList);
		
		mgp.showProductForEach(productList);
		
		

	}

}
