package com.sdv;

import java.util.Scanner;

public class OperatorMain {

	public static void main(String[] args) {
		int choice;
		float num1,num2,res;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("***************MENU*************");
		System.out.println("1.addition");
		System.out.println("2.subtraction");
		System.out.println("3.multiplication");
		System.out.println("4.multiplication");
		System.out.println("enter your choice");
		choice=sc. nextInt();
		
		System.out.println("enter 2 numbers");
		num1=sc.nextFloat();
		num2=sc.nextFloat();
		switch(choice) {
		case 1: res=num1+num2 ;
		System.out.println("sum of "+num1+" and "+num2+" is "+res);
		break;
		case 2:res=num1-num2;
		System.out.println("difference of "+num1+" and "+num2+" is "+res);
		break;
		case 3:res=num1*num2;
		System.out.println("product of "+num1+" and "+num2+" is "+res);
		case 4: if(num2==0) {
		System.out.println("divide by zero error");
		}
		
		else {
		
			res=num1/num2;
			System.out.println("quotient of "+num1+" and "+num2+" is "+res);
		}
		default:
			System.out.println("invalid input");

		}
	}
}
		

		
		
		

	


