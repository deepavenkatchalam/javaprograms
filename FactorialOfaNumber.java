package com.kode;

import java.util.Scanner;

public class FactorialOfaNumber {

	public static void main(String[] args) {
		int n;
		double fact=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number to calculate factorial of a number");
		n=sc.nextInt();
		for(int i=n;i>=1;i--) {
			fact=fact*i;
		}
System.out.println("factorial of "+n+" is "+fact);
	}

}
