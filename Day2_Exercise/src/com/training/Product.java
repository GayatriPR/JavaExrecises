package com.training;

public class Product extends Object {
	
	//Object is Superclass
	//Product is Sub Class
	
	private int	productId;
	private String productName;
	private double ratePerUnit;
	private int productType;
	private int quantity;
	private double discount;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Product(int productId, String productName, double ratePerUnit, int productType ,int quantity ,double discount ) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.ratePerUnit = ratePerUnit;
		this.productType= productType;
		this.quantity=quantity;
		this.discount=discount;
	}
	
	
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getRatePerUnit() {
		return ratePerUnit;
	}

	public void setRatePerUnit(double ratePerUnit) {
		this.ratePerUnit = ratePerUnit;
	}


	public int getProductType() {
		return productType;
	}


	public void setProductType(int productType) {
		this.productType = productType;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		//return this.productName + ":" + this.ratePerUnit;
      
		return super.toString() + this.productName + ":" + this.ratePerUnit;

	
	}
	
	
	
}
