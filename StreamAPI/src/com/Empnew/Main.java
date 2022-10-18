package com.Empnew;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Sanjit", 15000);
		Employee e2 = new Employee(2, "scub", 14000);
		Employee e3 = new Employee(3, "ubfeu", 45000);
		Employee e4 = new Employee(4, "uhdwo", 25000);
		
		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		for(Employee e:list) {
			if(e.getSalary()<20000) {
				e.addBonus();
			}
		}
		System.out.println(list);
		
	}

}
