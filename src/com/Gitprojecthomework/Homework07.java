package com.Gitprojecthomework;

public class Homework07 {

	public static void main(String[] args) {
		// 
		int n1=0;
		int n2=2;
		int n3;
		int i;
		int count=20;
		
		System.out.print(n1+" "+n2); 
		
		for (i=1;i<count; i++) {
			
			n3=n1+n2;
			
			System.out.print(" " +n3);
			n1=n2;
			n2=n3;
			}
	}

}
