package com.ex;
class ParentClass{
	int a=10;
	public int b=20;
	protected int c=30;
	protected int d=40;
	
	void showData() {
		System.out.println("Inside ParentClass");
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		
	}
}
class childClass extends ParentClass{
	void accessData() {
		System.out.println("Inside ChildClass");
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
	}
}
		

public class Ex_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	childClass obj=new childClass();
	obj.showData();
	obj.accessData();
					
		}		

	}


