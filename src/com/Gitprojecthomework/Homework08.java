package com.Gitprojecthomework;

public class Homework08 {

	public static void main(String[] args) {
		//Maximum and minimum number in the array
		
		int[]numbers= {12, 69, 33, 99, 300, 780};
		
		int max=numbers[0];
		
		int min=numbers[0];
		
		for(int i=0; i<numbers.length; i++) {
			
			if(numbers[i]>max) {
				
				max=numbers[i];
				
			}else if(numbers[i]<min) {
				
				min=numbers[i];
			}
		}
		System.out.println("THE largest number in array is "+max);
		System.out.println("The smallest number in array is "+min);
	}

}
