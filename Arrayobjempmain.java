package com.pattu;

import java.util.Scanner;

class EduEmployee{
	int eid;
	String ename;
	static String cname="Edubridge India";
	
	void inputEmp() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		eid=sc.nextInt();
		System.out.println("enter employee name");
		ename=sc.next();
	}
	void display() {
		System.out.println("eid="+eid);
		System.out.println("eid="+ename);
		System.out.println("company name="+cname);
		
	}
	
}

public class Arrayobjempmain {

	public static void main(String[] args) {
		EduEmployee eob[]=new EduEmployee[5];
		for(int i=0;i<eob.length;i++) {
			eob[i]=new EduEmployee();
			eob[i].inputEmp();
		}
		System.out.println("employee records are");
		for(int i=0;i<eob.length;i++) {
			eob[i].display();
	}


	}


}
