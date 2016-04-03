package com.ferondir.HRExample;

import java.util.*;

public class Employee{
	
	private static int NEXT_ID;
	
	private final int ID;
	private String name;
	private double salary;
	private Date hireDate;
	
	//Default constructor
	public Employee(){
		name = "Anonymous";
		salary = 0;
	}
	
	//Full Constructor
	public Employee(String Name, int HireYear, int HireMonth, int HireDay, double Salary){
		this.name = Name;
		this.salary = Salary;
		
		GregorianCalendar g = new GregorianCalendar(HireYear, HireMonth-1, HireDay);
		hireDate = g.getTime();
	}
	
	publi int getId(){
		return(ID);
	}
	
	static{
		int min_id = 100, max_id = 200;
		
		Random generator = new Random();
		NEXT_ID = min_id + generator.nextInt(max_id - min_id); //Generate random start ID in diapason min_id..max_id
		System.out.println(NEXT_ID);
	}
	
	{
		ID = NEXT_ID++;
	}
}