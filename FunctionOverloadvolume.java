package com.pattu;

public class FunctionOverloadvolume {
	double vol;
	double volume(double r) {
		vol=(double)4/3*(double)22/7*Math.pow(r, 3);
		return vol;
	}
	double volume(double h,double r) {
		vol=(double)22/7*r*r*h;
		return vol;
	}
	double volume(double l,double b,double h) {
		vol=l*b*h;
		return vol;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionOverloadvolume fo=new FunctionOverloadvolume();
		double volspr=fo.volume(3);
		System.out.println("volume of sphere="+volspr);
		double volcyl=fo.volume(4, 2);
		System.out.println("volume of cyclinder="+volcyl);
		double volcub=fo.volume(2, 4, 8);
		System.out.println("volume of cube="+volcub);
		
		
		
		

	}

}
