package com.pattu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Product{
	String pname;
	float pprice;
	int pid;
	Product(){
		pname=null;
		pprice=0;
		pid=0;
		
	}
	void inputProductdetails() throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter product name");
		pname=br.readLine();
		System.out.println("enter product price");
		pprice=Float.parseFloat(br.readLine());
		System.out.println("enter product id");
		pid=Integer.parseInt(br.readLine());
	}
	void ProductDetails() {
		System.out.println("name of the product="+pname);
		System.out.println("product price="+pprice);
		System.out.println("product id="+pid);
	}
}
	

public class ProductMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Product pob=new Product();
		pob.inputProductdetails();
		pob.ProductDetails();
		

	}

}
