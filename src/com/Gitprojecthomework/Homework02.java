package com.Gitprojecthomework;

public class Homework02 {

	public static void main(String[] args) {
//Create a 2D array of integer values. Print the sum of all numbers.
		
		int [][] number = {{10,20},{30,40}};
		int sum=0;
		
		for (int i = 0; i < number.length; i++) {
			
            for (int j = 0; j < number[i].length; j++) {
            	
                sum += number[i][j];
           }
        }
        System.out.println("The sum of all 2D arrays number is = "+sum);	
	}
	}

