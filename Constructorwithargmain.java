package com.pattu;
class StudentEdu{
	int sid;
	String sname;
	float sfees;
	//constructor with argument
	public StudentEdu(int sid, String sname, float sfees) {
		this.sid=sid; //this refers to the present object
		this.sname=sname;
		this.sfees=sfees;
	}
	
	void display() {
		System.out.println("Student id="+sid);
		System.out.println("Student name="+sname);
		System.out.println("Student fees="+sfees);
	}
}

public class Constructorwithargmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentEdu sob1=new StudentEdu(1,"deepu",7654.6f);
		StudentEdu sob2=new StudentEdu(2,"vino",8654.6f);
		StudentEdu sob3=new StudentEdu(3,"Priya",8254.6f);
		
		sob1.display();
		sob2.display();
		sob3.display();

	}

}
