package com.pattu;
class Addition{
	int i,j,s;
	Addition(){
		this(8);
		
		System.out.println("no arg constructor");

	}
	Addition(int i){
		System.out.println("one arg constructor");
	}
	
	void add(int i, int j) {
		this.i=i;
		this.j=j;
		System.out.println("inside addition"+this);
		s=i+j;
		
	}
	void display() {
		System.out.println("sum of"+i+" and "+j+" is ="+s);
	}
	
	}
	


public class DemoThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition ob=new Addition();
		Addition ob1=new Addition();
		System.out.println("created object"+ob);
		ob.add(3, 8);
		ob.display();
		ob1.add(3, 9);
		ob1.display();
		
	}

}
