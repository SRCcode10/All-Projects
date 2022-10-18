package com.Comparable;

public class MainClass {

	public static void main(String[] args) {
		Student s1 = new Student(1,"SAnjit",150);
		Student s2 = new Student(3,"SAnjit",550);
		int x = s1.compareTo(s2);
		System.out.println(x);
	}

}
