package com.Comparable;

import java.util.Comparator;

public class Student implements Comparator<Student>{
	private int id;
	private String name;
	private Integer marks;
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	

}
