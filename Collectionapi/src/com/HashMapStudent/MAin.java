package com.HashMapStudent;

import java.util.HashMap;
import java.util.Map;

public class MAin {
	public static void main(String[] args) {
		Student s1 = new Student(1, "Sanjit", 99);
		Student s2 = new Student(2, "dde", 99);
		Student s3 = new Student(13, "aak", 99);
		Student s4 = new Student(4, "fefe", 99);
		Student s5 = new Student(5, "ciie", 99);
		
		Map<Student, Integer> map=new HashMap<>();
		map.put(s1, 100);
		map.put(s2, 88);
		map.put(s3, 99);
		map.put(s4, 995);
		map.put(s5, 595);
		System.out.println(map);
	}

}
