package com.Gitprojecthomework;

public class Homework09 {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array
		
		int[] number = { 20, 40, 30, 100, 50 };
		int largest = number[0];
		int SecLargest = number[0];
		for (int n = 1; n < number.length; n++) {
			if (number[n] > largest) {
				SecLargest = largest;
				largest = number[n];
			} else if (number[n] > SecLargest) {
				SecLargest = number[n];
			}
		}
		System.out.println("The second largest number in the array is " + SecLargest);

	}

}
