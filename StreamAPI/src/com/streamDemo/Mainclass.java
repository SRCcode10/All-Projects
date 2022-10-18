package com.streamDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Mainclass {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(5);
		list.add(88);
		Predicate<Integer> predicate=(e)->(e<20);
		List<Integer> newList = list.stream().filter(predicate).collect(Collectors.toList());
		System.out.println(newList);
	}

}
