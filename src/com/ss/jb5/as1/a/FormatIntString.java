package com.ss.jb5.as1.a;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FormatIntString {
	
	static List<Integer> numbs = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	public static void main(String[] args) {
		FormatIntString fIS = new FormatIntString();
		System.out.println(fIS.createString(numbs));
	}
	
	public String createString(List<Integer> list) {
		String strNumb = list.stream().map(n -> {
			if (n % 2 == 0) {
				return "e" + n;
			} else {
				return "o" + n;
			}
		}).collect(Collectors.joining(","));
		return strNumb;
	}

}
