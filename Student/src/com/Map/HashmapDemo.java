package com.Map;

import java.util.HashMap;
import java.util.Map;

public class HashmapDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee(1,"Sanjit",20000);
		Employee e2 = new Employee(1,"Sanjit",20000);
		Employee e3 = new Employee(1,"Sanjit",20000);
		Employee e4 = new Employee(1,"Sanjit",20000);
		Employee e5 = new Employee(1,"Sanjit",20000);
		
		Map<String, Employee> hmap = new HashMap<>();
		hmap.put("FirstEmp",e1 );
		hmap.put("SecondEmp",e2 );
		hmap.put("ThirdEmp",e3 );
		hmap.put("FourthEmp",e4 );
		hmap.put("FifthEmp",e5 );
		System.out.println(hmap);

	}

}
