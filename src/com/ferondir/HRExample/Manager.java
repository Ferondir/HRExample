package com.ferondir.HRExample;

public class Manager extends Employee{
	
	private double bonus = 0;
	
	//Default constructor
	public Manager(){
		super();
		bonus = 0;
	}
	
	//Full constructor
	public Manager(String Name, int HireYear, int HireMonth, int HireDate, double Salary, double Bonus ){
		super(Name, HireYear, HireMonth, HireDate, Salary);
		this.bonus = Bonus;
	}
	
	@Override
	public double getSalary(){
		return(super.getSalary() + bonus);
	}
	
	@Override
	public String getPosition(){
		return("Manager");
	}
	
}