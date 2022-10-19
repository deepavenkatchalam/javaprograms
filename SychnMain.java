package com.thr;

class PrintTable{
	synchronized void multiplicationTable(int num) {
		for(int i=1;i<=10;i++) {
			System.out.println(num+"x"+i+"="+num*i);
		}
	}
}
class SynThreadClass1 extends Thread{
	PrintTable tob;
	public SynThreadClass1(PrintTable t) {
		tob=t; 
	}
	public void run() {
		tob.multiplicationTable(5);
	}
}
class SynThreadClass2 extends Thread{
	PrintTable tob;
	public SynThreadClass2(PrintTable t) {
		tob=t; 
	
}
	public void run() {
		tob.multiplicationTable(10);
	}
}
class SynThreadClass3 extends Thread{
	PrintTable tob;
	public SynThreadClass3(PrintTable t) {
		tob=t; 
	
}
	public void run() {
		tob.multiplicationTable(2);
	}
}


public class SychnMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintTable t=new PrintTable();
		SynThreadClass1 t1=new SynThreadClass1(t);
		SynThreadClass2 t2=new SynThreadClass2(t);
		SynThreadClass3 t3=new SynThreadClass3(t);
		t1.start();
		t2.start();
		t3.start();


	}

}
