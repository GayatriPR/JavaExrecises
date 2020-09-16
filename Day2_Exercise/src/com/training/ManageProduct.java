package com.training;

public class ManageProduct {
	
	//Example for if-else condition
	public Product[] calculateDiscount(Product[] productList) {
		
		double discount = 0.0;
		
		for(Product prods:productList)
		{
			if(prods.getRatePerUnit()>500 && prods.getRatePerUnit()<=1000)
			{
				discount=0.10;
				prods.setDiscount(discount*prods.getRatePerUnit());

			}
			else if(prods.getRatePerUnit()>1000)
			{
				discount=0.15;
				prods.setDiscount(discount*prods.getRatePerUnit());
			}
	   
		}
		
		 return productList;
	}
	
	//For-loop
	public void showProductsLegacy(Product[] productList) {
		for(int i=0;i<productList.length;i++)
		{
			System.out.println("Product:" + i +" = "+productList[i].getProductName() );
		}
	}
	
	public void showProductForEach(Product[] productList)
	{
		for(Product eachProduct: productList) {
			System.out.println(eachProduct.getProductName()+":"+eachProduct.getDiscount()*eachProduct.getQuantity());
		}
	}
	
	
	
	//switch statement
	public void calculateTax(Product product) {
		int productType = product.getProductType();
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
