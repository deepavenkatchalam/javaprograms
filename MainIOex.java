package com.oper;

import java.io.File;
import java.io.IOException;

public class MainIOex {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Creating a file");
		File myfile=new File("hellodeepu.txt");
		
		if(myfile.createNewFile()) {
			System.out.println("File is created");
		}else {
			System.out.println("File already exits");

		}
	}

}
