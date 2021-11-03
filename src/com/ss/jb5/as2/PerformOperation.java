package com.ss.jb5.as2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PerformOperation {	

	public static void main(String[] args) throws NumberFormatException, IOException {
		GetNumber gn = new GetNumber();
		int[][] numArray = gn.getNumber();
		FunctionalImplementation check = new FunctionalImplementation();
		int amount = numArray[0][0];
		int whichRow = 0;
		while (amount > 0) {
			whichRow++;
			int whichFunction = numArray[whichRow][0];
			int number = numArray[whichRow][1];
			if (whichFunction == 1) {
				if (FunctionalImplementation.scan(check.isOdd, number) == true) {
					System.out.println("ODD");
				} else {
					System.out.println("EVEN");
				}
			} else if (whichFunction == 2) {
				if (FunctionalImplementation.scan(check.isPrime, number) == true) {
					System.out.println("PRIME");
				} else {
					System.out.println("COMPOSITE");
				} 
			} else if (whichFunction == 3) {
				if (FunctionalImplementation.scan(check.isPalindrome, number) == true) {
					System.out.println("PALINDROME");
				} else {
					System.out.println("NOT A PALINDROME");
				}
			} amount--;
		}		
	}
	
//	public void run(int[][] numArray) {
//		PerformOperation po = new PerformOperation();
//		int amount = numArray[0][0];
//		int whichRow = 0;
//		while (amount > 0) {
//			whichRow++;
//			int whichFunction = numArray[whichRow][0];
//			int number = numArray[whichRow][1];
//			if (whichFunction == 1) {
//				if (PerformOperation.scan.(po.isOdd, number) == true) {
//					System.out.println("ODD");
//				} else {
//					System.out.println("EVEN");
//				}
//			} else if (whichFunction == 2) {
//				if (isPrime(number) == true) {
//					System.out.println("PRIME");
//				} else {
//					System.out.println("COMPOSITE");
//				} 
//			} else if (whichFunction == 3) {
//				if (isPalindrome(number) == true) {
//					System.out.println("PALINDROME");
//				} else {
//					System.out.println("NOT A PALINDROME");
//				}
//			} amount--;
//		}		
//	}


}
