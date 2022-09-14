package com.edu.dee;

import java.util.Scanner;

public class userinputdata {

	public static void main(String[] args) {
		String sname;
		int sage;
		float stotalmarks;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter name");
			sname=sc.nextLine();
			System.out.println("Enter age");
			sage=sc.nextInt();
			System.out.println("Enter total marks");
			stotalmarks=sc.nextFloat();
		}
		System.out.println("Student details");
		System.out.println("Name="+sname);
		System.out.println("Age="+sage);
		System.out.println("Total Marks="+stotalmarks);

	}

}
