package com.ss.jb5.as2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PerformOperation {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		PerformOperation po = new PerformOperation();
		po.run(po.getNumber());
	}
	
	public void run(int[][] numArray) {
		int amount = numArray[0][0];
		int whichRow = 0;
		while (amount > 0) {
			whichRow++;
			int whichFunction = numArray[whichRow][0];
			int number = numArray[whichRow][1];
			if (whichFunction == 1) {
				if (isOdd(number) == true) {
					System.out.println("ODD");
				} else {
					System.out.println("EVEN");
				}
			} else if (whichFunction == 2) {
				if (isPrime(number) == true) {
					System.out.println("PRIME");
				} else {
					System.out.println("COMPOSITE");
				} 
			} else if (whichFunction == 3) {
				if (isPalindrome(number) == true) {
					System.out.println("PALINDROME");
				} else {
					System.out.println("NOT A PALINDROME");
				}
			} amount--;
		}
		
	}

	public int[][] getNumber() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the amount of numbers you want to check.");
		int amount = Integer.parseInt(br.readLine());
		int[][] array = new int[amount+1][2];
		array[0][0] = amount;
		array[0][1] = 0;
		int whichRow = 0;
		while (amount > 0) {
			whichRow++;
			System.out.println("Enter 1 to check if number is odd, enter 2 to check if it is a prime, or enter 3 to check if it is a palindrome.");
			int whichFunction = Integer.parseInt(br.readLine());
			array[whichRow][0] = whichFunction;
			System.out.println("Enter the number you would like to check.");
			int number = Integer.parseInt(br.readLine());
			array[whichRow][1] = number;
			amount--;
		}
		return array;				
	}

	public boolean isOdd(Integer num) {
		if (num % 2 == 0) {
			return false;
		} else {
			return true;
		}
	}
	
	public boolean isPrime(Integer num) {
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
	}
	
	public boolean isPalindrome(Integer num) {
		String str = String.valueOf(num);
		String strReversed = new StringBuffer(str).reverse().toString();
		return str.equals(strReversed);
	}	
}
