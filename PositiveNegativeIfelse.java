package com.kd;

import java.util.Scanner;

class PositiveNegative{
	int num;
	void inputdata() {
		    try (Scanner sc = new Scanner(System.in)) {
				System.out.println("enter number");
				num=sc.nextInt();
			}
		}
	void CheckNum() {
		if (num>0) {
			System.out.println("positive"+num);
		}
		else {
			System.out.println("negative"+num);
		}
	}
	
}

public class PositiveNegativeIfelse {

	public static void main(String[] args) {
		PositiveNegative  pn=new PositiveNegative();
		pn.inputdata();
		pn.CheckNum();
		

	}

}
