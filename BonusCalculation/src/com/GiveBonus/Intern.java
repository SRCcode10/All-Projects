package com.GiveBonus;

public abstract class Intern {
	private int internId;
	private String internName;
	private int salary;
	
	
	public Intern(int internId, String internName, int salary) {
		super();
		this.internId = internId;
		this.internName = internName;
		this.salary = salary;
	}
	public int getInternId() {
		return internId;
	}
	public void setInternId(int internId) {
		this.internId = internId;
	}
	public String getInternName() {
		return internName;
	}
	public void setInternName(String internName) {
		this.internName = internName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public abstract void addBonus() {
		
	}

}
