package com.pattu;
class MyClassConstructor{
	int i,j,k;
	MyClassConstructor(){
		System.out.println("construvtor with no arg");
	}
	MyClassConstructor(int i){
		System.out.println("construvtor with one arg"+i);
		
	}
	MyClassConstructor(int i,int j){
		System.out.println("construvtor with two arg"+i+" and "+j);
	}
	MyClassConstructor(int i,int j,int k){
		System.out.println("construvtor with three arg"+i+" and "+j+" and "+k);
	}
	
}

public class ConstructorOverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClassConstructor ob1=new MyClassConstructor();
		MyClassConstructor ob2=new MyClassConstructor(5);
		MyClassConstructor ob3=new MyClassConstructor(5,9);
		MyClassConstructor ob4=new MyClassConstructor(5,9,7);
		
		

	}

}
