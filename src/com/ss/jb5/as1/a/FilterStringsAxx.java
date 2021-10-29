package com.ss.jb5.as1.a;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStringsAxx {
	
	static List<String> words = Arrays.asList("Apple", "Watermelon", "Cherry", "Apricot",
			"Avocado", "Axe", "Cat", "Dog", "Ace", "Bowl", "App");

	public static void main(String[] args) {
		FilterStringsAxx fSA = new FilterStringsAxx();
		fSA.filterStrings(words);
	}
	
	public void filterStrings(List<String> list) {
		list.stream().filter(str -> str.charAt(0) == 'A' && str.length() == 3)
				.collect(Collectors.toList())
				.forEach((str) -> System.out.println(str));
	}

}
