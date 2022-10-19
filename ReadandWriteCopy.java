package com.iooper;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class ReadandWriteCopy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		   FileInputStream fis=new FileInputStream("courses.txt");
	         FileOutputStream fos=new FileOutputStream("copycourses.txt");
	         int b;
	         while((b=fis.read())!=-1) { //-1 is the endof the file
	        	                         
	        	 fos.write(b);
	         }
	         fis.close();
	         fos.close();
	}

}
