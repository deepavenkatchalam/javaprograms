package com.sdv;

import java.util.Scanner;

class Area{
	int choice;
	float length,breadth,radius,base,area,height,pi=3.14f;
	Scanner sc = new Scanner(System.in);
	
	public void areasquare() {
		System.out.println("enter length of square");
		length = sc.nextFloat();
		area=length*length;
		System.out.println("area of square="+area);
	}
	public void arearectangle() {
		System.out.println("enter length and breadth rectangle");
		length = sc.nextFloat();
		breadth = sc.nextFloat();
		area=length*breadth;
		System.out.println("area of rectangle="+area);

	}
	public void areatriangle() {
		System.out.println("enter length triangle");
		base = sc.nextFloat();
		height = sc.nextFloat();
		area=1/2*(base*height);
		System.out.println("area of triangle="+area);
	}
	public void areacircle() {
		System.out.println("enter length of circle");
		radius = sc.nextFloat();
		area=pi*radius*radius;
		System.out.println("area of circle="+area);
	}
}

public class MainArea {

	public static void main(String[] args) {
		int choice;
		
		Area aob=new Area();
		Scanner sc=new Scanner (System.in);
		System.out.println("*******************MENU**************");
		System.out.println("1.area of square");
		System.out.println("2.area of rectangle");
		System.out.println("3.area of triangle");
		System.out.println("4.area of circle");
		
		System.out.println("1.enter your choice");
		choice=sc.nextInt();
		
		switch(choice) {
		case 1:aob.areasquare();
		break;
		case 2:aob.arearectangle();
		break;
		case 3:aob.areatriangle();
			break;
		case 4:aob.areacircle();
			break;
			default:System.out.println("invalid input");
		}	

	}

}
