package com.Map;

public class Employee {
	int empid;
	String name;
	double salary;
	
	public Employee(int empid, String name, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emploee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}
	
	

}
