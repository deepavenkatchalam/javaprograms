package com.sdv;

import java.util.Scanner;

 class AreaMain {

	public static void main(String[] args) {
		int choice;
		float pi=3.14f;
		float area,length,breadth,base,height,radius;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("*******************MENU**************");
			System.out.println("1.area of square");
			System.out.println("2.area of rectangle");
			System.out.println("3.area of triangle");
			System.out.println("4.area of circle");
			
			System.out.println("1.enter your choice");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("enter length of square");
				length = sc.nextFloat();
				area=length*length;
				System.out.println("area of square="+area);
				break;
				
			case 2:
				System.out.println("enter length and breadth rectangle");
				length = sc.nextFloat();
				breadth = sc.nextFloat();
				area=length*breadth;
				System.out.println("area of rectangle="+area);
				break;
				
			case 3:
				System.out.println("enter length triangle");
				base = sc.nextFloat();
				height = sc.nextFloat();
				area=1/2*(base*height);
				System.out.println("area of triangle="+area);
				break;
				
			case 4:
				System.out.println("enter length of circle");
				radius = sc.nextFloat();
				area=pi*radius*radius;
				System.out.println("area of circle="+area);
				break;
				
				default:
					System.out.println("Invalid input");
			}
		}
		
		
		

	}

}
