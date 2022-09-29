package com.pattu;

public class ArmstrongNo {
	

	public static void main(String[] args) {
		int num = 153;
		double sum = 0;
		int d;
		int orgnum = num;
		while (num > 0) {
			d = num % 10;
			sum = sum + Math.pow(d, 3);
			num = num / 10;
			}
		if (sum == orgnum) {
			System.out.println(orgnum + " is an armstrong number");

		} else {
			System.out.println(orgnum + " is not armstrong number");
		}
	}

}
