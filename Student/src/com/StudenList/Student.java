package com.StudenList;

public class Student {
	
	int id;
	String name;
	String dep;
	public Student(int id, String name, String dep) {
		super();
		this.id = id;
		this.name = name;
		this.dep = dep;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dep=" + dep + "]";
	}
	
	

}
