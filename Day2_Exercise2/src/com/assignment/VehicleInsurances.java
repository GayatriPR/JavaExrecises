package com.assignment;

public class VehicleInsurances extends Insurance {
	
	private int vehicleModel;
	private int yearOfManufacture;
	private double costOfVehicle;
	
	public VehicleInsurances() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public VehicleInsurances(int vehicleModel, int yearOfManufacture, double costOfVehicle) {
		super();
		this.vehicleModel = vehicleModel;
		this.yearOfManufacture = yearOfManufacture;
		this.costOfVehicle = costOfVehicle;
	}


	public VehicleInsurances(int policyNumber, String policyHolderName, int policyHolderAge, double insuredAmount, int vehicleModel, int yearOfManufacture, int costOfVehicle) {
		super(policyNumber, policyHolderName, policyHolderAge, insuredAmount);
		this.vehicleModel=vehicleModel;
		this.yearOfManufacture=yearOfManufacture;
		this.costOfVehicle = costOfVehicle;
	}
	public int getVehicleModel() {
		return vehicleModel;
	}
	public void setVehicleModel(int vehicleModel) {
		this.vehicleModel = vehicleModel;
	}
	public int getYearOfManufacture() {
		return yearOfManufacture;
	}
	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}
	public double getCostOfVehicle() {
		return costOfVehicle;
	}
	public void setCostOfVehicle(double costOfVehicle) {
		this.costOfVehicle = costOfVehicle;
	}
	
	
	@Override
	public double calculatePremium() {
		// TODO Auto-generated method stub
		
		double amount =0.0;
		if(this.vehicleModel==2)
		{
				if(this.yearOfManufacture<2)
				{
					amount =  0.50*this.costOfVehicle;
				}
				else
				{
					amount = 0.60 *this.costOfVehicle;
				}
		}
		if(this.vehicleModel==4)
		{
				if(this.yearOfManufacture<2)
				{
					amount =  0.40*this.costOfVehicle;
				}
				else
				{
					amount = 0.50 *this.costOfVehicle;
				}
		}
		
		return amount;
		
	}

}
