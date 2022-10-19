package com.thr;
class SynchEx{
	synchronized void show(String p) {
		try {
			System.out.println("******");
			System.out.println(p);
			Thread.sleep(1000);
			System.out.println("######");
		}
		catch(InterruptedException e) {
			e.printStackTrace();
			
		}
	}
}
class mythread implements Runnable{
	Thread c;
	String m;
	SynchEx r;
	mythread(SynchEx w,String k){
		r=w;m=k;
		c=new Thread(this);
		
		}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		r.show(m);
		
	}
	}
	


public class SychmainappEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SynchEx d=new SynchEx();
		mythread t1=new mythread(d,"Hello");
		mythread t2=new mythread(d,"JAVA");
		t1.c.start();
		t2.c.start();

	}

}
