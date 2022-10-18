package com.streamDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestClass {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Sanjit");
		list.add("Manish");
		list.add("ajf");
		list.add("Rajesh");
		
		List<String> name = list.stream().filter(e->e.equals("Manish")).collect(Collectors.toList());
		System.out.println(name);
	
	}

}
