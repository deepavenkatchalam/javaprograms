package com.pattu;

import java.util.Scanner;

public class Factorialnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,fact=1;
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		num=sc.nextInt();
		for(i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println("factorial of the" +num+ "is"+fact);

	}

}
