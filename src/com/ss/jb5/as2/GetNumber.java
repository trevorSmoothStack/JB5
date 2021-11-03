package com.ss.jb5.as2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetNumber {

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
}
