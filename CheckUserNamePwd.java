package com.str;

import java.util.Scanner;

public class CheckUserNamePwd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String uname,upwd;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		uname=sc.next();
		System.out.println("enter password");
		upwd=sc.next();
		
		if(uname.equalsIgnoreCase("deepa")&& upwd.equals("deepa123*")) {
			System.out.println("valid user");
		}else {
			System.out.println("invalid user");
			
		}
		
		
		

	}

}
