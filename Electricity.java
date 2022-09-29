package com.pattu;

import java.util.Scanner;

public class Electricity {
	String n;
	int units;
	double bill;
	
	void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter customer name");
		n=sc.next();
		System.out.println("enter the units of power consumed");
		units=sc.nextInt();
		
	}
	void calculate() {
		if(units<=100) {
			bill=units*2;
		}else if(units<=300) {
				bill=200+(units-100)*3;
		}else {
			double amt=200+600+(units-300)*5;
			double surcharge=(amt*2.5)/100;
			bill=amt+surcharge;
				
		}
	}
	void display() {
		System.out.println("enter customer name:"+n);
		System.out.println("enter the units of power consumed"+units);
		System.out.println("bill amount:"+bill);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Electricity eb=new Electricity();
		eb.accept();
		eb.calculate();
		eb.display();

	}

}
