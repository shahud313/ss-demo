package com.guiapps;

public class ThreadDemo1 extends Thread {
	public void run () {
		System.out.println("My Thread");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThreadDemo1 th = new ThreadDemo1();
th.start();
System.out.println(th. getName());
	}

}
