package com.pattu;

public class ConstructorEx {
	int i;
	String s;
	float sal;
	ConstructorEx(){
		i=9;
		s="hello";
		sal=456.2f;
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorEx ob=new ConstructorEx();
		System.out.println("i="+ob.i);
		System.out.println("s="+ob.s);
		
		System.out.println("sal="+ob.sal);
		

		

	}

}
