package com.ferondir.HRExample;

public class Main{
	public static void main(String[] args){
		System.out.println("Yes. It's true. I love you!");
		
		Employee[] e = new Employee[7];
		Manager m = new Manager("Pavel",2011,12,01,5000,2500);
		//System.out.println(m.getId() + " " + m.getName() + " " + m.getHireDate() + " " + m.getSalary() + " " + m.getPosition());
		
		e[0] = new Employee();
		e[1] = new Employee("Rex", 10);
		e[2] = new Employee("Roma", 10);
		e[3] = new Employee();
		e[4] = new Employee("Test", 2016, 04, 13, 1000);
		e[5] = new Employee("Kto-to", 2015, 01, 01, 100);
		e[6] = m;
		
		for(Employee ee : e){
			System.out.println(ee.getId() + " " + ee.getName() + " " + ee.getHireDate() + " " + ee.getSalary() + " " + ee.getPosition()); //
		}
		
		System.out.println("--------------------------\nRaise salary\n");
		for(Employee ee : e){
			ee.raiseSalary(10);
			System.out.println(ee.getId() + " " + ee.getName() + " " + ee.getHireDate() + " " + ee.getSalary() + " " + ee.getPosition()); //
		}
	}
	

	
}