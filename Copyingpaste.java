package com.iooper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class Copyingpaste {

	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub
		FileInputStream fis1=new FileInputStream("s1.txt");
		FileInputStream fis2=new FileInputStream("s2.txt");
		FileOutputStream fos=new FileOutputStream("s3.txt");
		
		
		//Logically combines more than one file
		SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
		
       int b;
      while((b=sis.read())!=-1) {
    	  fos.write(b);
    	  System.out.println((char)b);
    	 
      }
          
           
           System.out.println("Copying files is completed");
           FileInputStream fis3=new FileInputStream("s3.txt");
      		
      
           FileInputStream fis4=new FileInputStream("s4.txt");
        	SequenceInputStream sis1=new SequenceInputStream(fis3,fis4);
       	FileOutputStream fos1=new FileOutputStream ("s5.txt");
		
       
       while((b=sis.read())!=-1) {
     	  fos1.write(b);
     	  System.out.println((char)b);
     	 
       }
            fis1.close();
            fis2.close();
            sis.close();
            fos.close();
            fis3.close();
            fis4.close();
   		
	}


	}


