package com.streamDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DEmo {
	
	public static void main(String[] args) {
		Employee e1=new Employee(112,"Sanjit",100000);
		Employee e2=new Employee(113,"Sdde",200000);
		Employee e3=new Employee(115,"feef",80000);
		Employee e4=new Employee(113,"Sgde",150000);
		
		List<Employee> list=new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		List<String> sallist = list.stream().filter(e->e.getSalary()<150000).map(e->e.getName()).collect(Collectors.toList());
		System.out.println(sallist);
	}

}
