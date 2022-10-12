package com.exe;

import java.util.Scanner;

public class AgeCheckMovie {
	public static void checkage(int age) {
		try {
			if(age<18) {
				throw new ArithmeticException("not eligible for voting");
			}else {
				System.out.println("you are eligible for voting");
				
			
			}
		
		
	}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int perage;
		Scanner sc=new Scanner(System.in);
		System.out.println("entrer age");
		perage=sc.nextInt();
		checkage(perage);
		

	}

}
