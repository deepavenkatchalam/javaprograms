package com.pack;
class Bank{
	float rateOfInterest() {
		return 0;
	}
}
class SBI extends Bank{
	float rateOfInterest() {
		return 7.5f;
	}
}
class HDFC extends Bank{
	float rateOfInterest() {
		return 8f;
	}
}
class IDBI extends Bank{
	float rateOfInterest() {
		return 8.5f;
	}
}



public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b;
		b=new SBI();
		System.out.println("rate of intrest of SBI="+b.rateOfInterest());
		b=new HDFC();
		System.out.println("rate of intrest of HDFC="+b.rateOfInterest());
		b=new IDBI();
		System.out.println("rate of intrest of IDBI="+b.rateOfInterest());
		

	}

}
