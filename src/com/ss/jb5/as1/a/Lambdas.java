package com.ss.jb5.as1.a;

import java.util.Arrays;
import java.util.Comparator;

public class Lambdas {

	static String[] names = { "Trevor", "Sydney", "Makinsey", "Chris", "Nick", "Corie", "Johnny", "Emily", "Libby",
			"Jillian", "Annie", "Brandon", "Eleneor" };

	public static void main(String[] args) {
		Lambdas l = new Lambdas();
		l.sort(names);
		l.reverseSort(names);
		l.eFirst(names);
		l.eFirstwHelper(names);
	}

	public void sort(String[] args) {
//		 Arrays.sort(names, Comparator.comparingInt(String::length));
		Arrays.sort(args, (a, b) -> Integer.compare(a.length(), b.length()));
		System.out.println("Sorted from shortest to longest:");
		for (String name : args) {
			System.out.println(name);
		}
		System.out.println("***************************");
	}

	public void reverseSort(String[] args) {
//		 Arrays.sort(names, Comparator.comparingInt(String::length).reversed());
		Arrays.sort(args, (a, b) -> Integer.compare(b.length(), a.length()));
		System.out.println("Sorted from longest to shortest:");
		for (String name : args) {
			System.out.println(name);
		}
		System.out.println("***************************");
	}

	public void eFirst(String[] args) {
		Arrays.sort(args, Comparator.comparingInt(a -> (a.contains("E") || a.contains("e") ? 0 : 1)));
		System.out.println("Sorted by words that contain the letter 'e', first: ");
		for (String name : args) {
			System.out.println(name);
		}
		System.out.println("***************************");
	}
	
	public void eFirstwHelper(String[] args) {
		EComparator Utils = new EComparator();
		Arrays.sort(args, (o1, o2) -> Utils.compare(o1, o2));
		System.out.println("Sorted by words that contain the letter 'e', first. This is using a helper.");
		for (String name : args) {
			System.out.println(name);
		}
		System.out.println("***************************");
	}
	
	

}
