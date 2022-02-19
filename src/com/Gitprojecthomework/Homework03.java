package com.Gitprojecthomework;

public class Homework03 {

	public static void main(String[] args) {
		//Create a 2D array or integer type where you will store odd and even numbers. 
		//Develop a program which will identify/print the even numbers only.
		
		int [][] num= {{3,2,7,8},
				   {19,5,6,3,12},
				   {10,11}
				   };

		for(int i=0;i<num.length;i++) {
			
			for(int a=0;a<num[i].length;a++) {
				
				if(num[i][a]%2==0) {
					
				System.out.println(num[i][a]+ "  ");
			}

	}
		}
}
}
