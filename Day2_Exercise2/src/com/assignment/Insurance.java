package com.assignment;

public class Insurance {
	
	 int policyNumber;
     String policyHolderName;
	 int policyHolderAge;
	 double insuredAmount;
	
	public Insurance() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Insurance(int policyNumber, String policyHolderName, int policyHolderAge, double insuredAmount) {
		super();
		this.policyNumber = policyNumber;
		this.policyHolderName = policyHolderName;
		this.policyHolderAge = policyHolderAge;
		this.insuredAmount = insuredAmount;
	}



	public int getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getPolicyHolderName() {
		return policyHolderName;
	}

	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}

	public int getPolicyHolderAge() {
		return policyHolderAge;
	}

	public void setPolicyHolderAge(int policyHolderAge) {
		this.policyHolderAge = policyHolderAge;
	}



	public double getInsuredAmount() {
		return insuredAmount;
	}

	public void setInsuredAmount(double insuredAmount) {
		this.insuredAmount = insuredAmount;
	}

	public double calculatePremium() {
		 
		double premium = 0.0;
		
		if(policyHolderAge<25)
		{
			premium= this.insuredAmount * 0.60;
		}
		else
		{
			premium= this.insuredAmount * 0.70;
		}
		return premium;
		
	}
	

}
