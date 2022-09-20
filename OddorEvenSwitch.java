package com.sdv;

import java.util.Scanner;
public class OddorEvenSwitch {


	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		num=sc.nextInt();
		switch(num%2) {
		case 0:
			System.out.println(num + "is a even number");
			break;
		case 1:
			System.out.println(num + "is a odd number");
			break;
			
		}
		

	}

}
