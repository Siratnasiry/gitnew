package com.Gitprojecthomework;

public class Homework04 {

	public static void main(String[] args) {
		// Create a 2D array of integers. Develop a program which will calculate the sum of  even and odd numbers for that array.
		
		int[][] array = {{2, 7, 9, 8}, {3, 6, 1}, {7, 4, 2}};
        int sumEven = 0;
        int sumOdd = 0;
        
        for (int i = 0; i < array.length; i++) {
        	
            for (int j = 0; j < array[i].length; j++) {
            	
                if (array[i][j] % 2 == 0) {
                	
                    sumEven = sumEven + array[i][j] ;
                    
        
                } else  {
                    	
                        sumOdd = sumOdd + array[i][j];
        {
            System.out.println("The sum of  even numbers are " + sumEven);
            System.out.println("The sum of  odd numbers are " + sumOdd);
        }
    }
            }
            }
            }
            } 
        
