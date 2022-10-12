package com.exe;

public class ArrMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {6,4,2};
		System.out.println("before array element display");
		System.out.println("first element"+a[0]);
		System.out.println("second element"+a[1]);
		System.out.println("third element"+a[2]);
		try {
			System.out.println("fourth element"+a[3]);
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("hello,catch will execute only when there is exception");
			e.printStackTrace();
			
		}
		finally {
			System.out.println("finally block execute always, even though exception occur or not");
		}
		System.out.println("hello everyone");
	


	}

}
