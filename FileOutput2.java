package com.iooper;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos=new FileOutputStream("Myinfo.txt");
		String str="learn java programming";
		fos.write(str.getBytes());
		fos.close();
		

	}

}
