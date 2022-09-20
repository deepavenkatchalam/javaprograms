package com.kode;

import java.util.Scanner;

public class PrimenumberOrNot {

	public static void main(String[] args) {
		int i,num,fc=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number to check prime");
		num=sc.nextInt();
		
		for(i=1;i<=num;i++) {
		
			if(num%i ==0) {
			
				fc++;
			}
		}
		
		if(fc==2) {
			System.out.println(num+"is a prime number");
		}
		else
			System.out.println(num+"is not a prime number");
		
	}

}
