package com.ss.jb5.as2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Functional {

	public static void main(String[] args) {
		Functional fun = new Functional();
		List<Integer> numList = new ArrayList<Integer>(); 
		numList.add(1);
		numList.add(15);
		numList.add(124);
		numList.add(251);
		numList.add(248);
		numList.add(3);
		numList.add(85);
		numList.add(99);
		numList.add(201);
		System.out.println(fun.rightDigit(numList));
		System.out.println(fun.doubling(numList));
		List<String> strings = new ArrayList<String>(); 
		strings.add("xmen");
		strings.add("xxxtentacion");
		strings.add("excellent");
		strings.add("xmas");
		strings.add("xylophone");
		System.out.println(fun.noX(strings));
	}

	public List<Integer> rightDigit(List<Integer> nums) {
		return nums.stream().map(n -> n % 10).collect(Collectors.toList());
	}
	
	public List<Integer> doubling(List<Integer> nums) {
		return nums.stream().map(n -> n * 2).collect(Collectors.toList()); 
	}
	
	public List<String> noX(List<String> strs) {
		return strs.stream().map(str -> str.replace("x", "")).collect(Collectors.toList()); 
	}
}
