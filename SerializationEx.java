package com.iooper;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

class Student{
	int rollno;
	String name;
	String dept;
}

public class SerializationEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fo=new FileOutputStream("Stud.txt");
		PrintStream ps=new PrintStream(fo);
		Student sob=new Student();
		sob.rollno=1234;
		sob.name="deepu";
		sob.dept="BCA";
		ps.println(sob.rollno);
		ps.println(sob.name);
		ps.println(sob.dept);
	    fo.close();
	    ps.close();
	    System.out.println("Student object is writen to the file");


		

	}

}
