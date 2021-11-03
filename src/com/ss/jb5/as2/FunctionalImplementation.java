package com.ss.jb5.as2;

public class FunctionalImplementation implements FunctionalInterface {

	public static boolean scan(FunctionalInterface f, int num) {
		return f.scan(num);
	}

	FunctionalInterface isOdd = num -> num % 2 == 0 ? false : true;
	
	FunctionalInterface isPrime = num -> {
		boolean prime = false;
		if (num == 1) {
			prime = true;
		} else {
			for (int i = 2; i < num / 2; i++) {
				if (num % i == 0) {
					prime = false;
					break;
				} else {
					prime = true;
				}
			}			
		}
		return prime;	
	};

	
	FunctionalInterface isPalindrome = num -> {
		String str = String.valueOf(num);
		String strReversed = new StringBuffer(str).reverse().toString();
		return str.equals(strReversed);
	};


//	FunctionalInterface isPrime = 
//		return num -> {
//			if (num == 1) {
//				return true;
//			} else {
//				for (int i = 2; i<num/2; i++) {
//					if (num % i == 0) {
//						return false;
//							break;
//						} else {
//							return true;
//						}
//				}
//			}};
//
//	public boolean isPalindrome(Integer num) {
//		return n -> {
//			String str = String.valueOf(num);
//			String strReversed = new StringBuffer(str).reverse().toString();
//			return str.equals(strReversed);			
//			}
//	}
}
