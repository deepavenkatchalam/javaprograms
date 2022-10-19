package com.thr;
class MyThread2 extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Thread Name="+Thread.currentThread() +"i="+i);
		}
	}
}


public class ThreadPriori {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread2 tob1=new MyThread2();
		MyThread2 tob2=new MyThread2();
		tob1.setName("first");
		tob2.setName("second");
		tob1.setPriority(2);
		tob2.setPriority(4);
		tob1.start();
		tob2.start();


	}

}
