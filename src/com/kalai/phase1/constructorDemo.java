package com.kalai.phase1;
//default constructor
class Employee{
	int id;
	String name;
	void display() {
		
		System.out.println(id +" "+name);
	}
}
//Parameterized Construtor
class Employee1{
	int empid;
	String empname;
	public Employee1(int empid, String empname) {
		super();
		this.empid = empid;
		this.empname = empname;
	}
	void empresult() {
		
		System.out.println(empid +" " + empname);
	}
}
public class constructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Default construtor");
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		e1.id = 10;
		e1.name = "vaishu";
		e2.id = 20;
		e2.name = "sruthi";
		e1.display();
		e2.display();
		System.out.println("Parameterized Constructor");
		Employee1 emp1 = new Employee1(30,"Ram");
		Employee1 emp2 = new Employee1(40,"Rahul");
		emp1.empresult();
		emp2.empresult();

	}
}
