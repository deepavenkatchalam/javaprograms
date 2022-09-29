package com.pattu;

class OverloadDataType{
	void addition(int i,int j) {
		int sum=i+j;
		System.out.println("the addition of two integer numbers is "+sum);
	}
	void addition(float i,float j) {
		float sum=i+j;
		System.out.println("the addition of two integer numbers is "+sum);
	}
	void addition(double i,double j) {
		double sum=i+j;
		System.out.println("the addition of two integer numbers is "+sum);
	}
	void addition(short i,short j) {
		short sum=(short)(i+j);
		System.out.println("the addition of two integer numbers is "+sum);
	}
	void addition(byte i,byte j) {
		byte sum=(byte)(i+j);
		System.out.println("the addition of two integer numbers is "+sum);
	}
	
		
	
	}
	

public class OverloadTypeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadDataType ot=new OverloadDataType();
		ot.addition(4, 7);
		ot.addition(5.8f, 6.7f);
		ot.addition(6, 7);
		ot.addition(32, 23);
		ot.addition(6.7, 8.9);
		
	}

}
