package com.pattu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacciseries {
	int f1,f2,f3,terms;
	Fibonacciseries(){
		f1=0;
		f2=1;	
	}
	void inputData() throws IOException {
		InputStreamReader is=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(is);
			System.out.println("enter the no of terms in fibonacci series");
			terms= Integer.parseInt(br.readLine());
	}
	void generatefibseries() {
		System.out.println("fibnocci series");
		System.out.println(f1);
		System.out.println(f2);
		for(int i=1;i<=terms-2;i++) {
			f3=f1+f2;
			System.out.println(f3);
			f1=f2;
			f2=f3;
		}
	}

	


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 Fibonacciseries fb=new  Fibonacciseries();
		 fb.inputData();
		 fb.generatefibseries();
		
	}

}
