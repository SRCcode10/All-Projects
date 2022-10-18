package com.hashsetemployee;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Employee e1 = new Employee("sanjit", 2500000);
		Employee e2 = new Employee("rajesh", 2500000);
		Employee e3 = new Employee("helo", 2500000);
		Employee e4 = new Employee("bye", 2500000);
		Employee e5 = new Employee("sanjit", 2500);
		
		Set<Employee> hset= new HashSet<>();
		hset.add(e1);
		hset.add(e5);
		hset.add(e4);
		System.out.println(hset);

	}

}
