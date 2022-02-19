package com.Gitprojecthomework;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		//Create an array on int values using a scanner and calculate the sum of all stored elements in that array.
		
		int number;
		System.out.println(" enter the total number of array");
		number=scan.nextInt();
		
		int[] a = new int[number];
		
		System.out.println("The lat number of array is 360");
		
		System.out.println("=================================");
		
		int numbers[]= {20,40,100,200};
		int sum = 0;
				for (int n : numbers) {
					sum +=n;
					System.out.println(sum);
	}

}
}
