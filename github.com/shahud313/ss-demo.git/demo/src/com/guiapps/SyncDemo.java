package com.guiapps;

class TContent{
	public synchronized void  m1(String s) {
		System.out.println("{");
	 System.out.println(s);
	try {
		Thread.sleep(200);
	}
	catch(Exception e) {
		
	}
	System.out.println("}");
	}
	
}
class ThreadJob extends Thread{
	TContent t;
	String s;
	public ThreadJob(TContent t, String s) {
		this.t=t ;
		this.s=s;
		
		start();
		
	}
	public ThreadJob(TContent t2) {
		// TODO Auto-generated constructor stub
	}
	public void run() {
		t.m1(s);
	}
}
	

public class SyncDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TContent t= new TContent();
		
		
	new ThreadJob(t,"hello");
	new ThreadJob(t,"world");
		
		

	}

}
