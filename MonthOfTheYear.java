package com.sdv;

import java.util.Scanner;

public class MonthOfTheYear {

	public static void main(String[] args) {
		String month;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Month of the year");
		month=sc.next();
		switch(month) {
		case "january":System.out.println("First Month Of The Year");
		break;
		case "february":System.out.println("Second Month Of The Year");
		break;
		case "march":System.out.println("Third Month Of The Year");
		break;
		case "april":System.out.println("Fourth Month Of The Year");
		break;
		case "may":System.out.println("Fivth Month Of The Year");
		break;
		case "june":System.out.println("Sixth Month Of The Year");
		break;
		case "july":System.out.println("Seventh Month Of The Year");
		break;
		case "august":System.out.println("Eighth Month Of The Year");
		break;
		case "september":System.out.println("Nineth Month Of The Year");
		break;
		case "october":System.out.println("Tenth Month Of The Year");
		break;
		case "november":System.out.println("Eleventh Month Of The Year");
		break;
		case "december":System.out.println("Twelveth Month Of The Year");
		break;
		default:System.out.println("invalid input");
		}
	}

}
