package com.kode;

import java.util.Scanner;

public class PrintFactorSum {

	public static void main(String[] args) {
		int n,s=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("print factors");
		
		System.out.println("enter numbers");
		n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
				s=s+i;
			}
		}
		System.out.println("print factors sum s"+s);
		
		

	}

}
