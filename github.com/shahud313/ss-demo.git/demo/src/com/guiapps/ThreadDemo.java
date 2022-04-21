package com.guiapps;	

public class ThreadDemo  implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ThreadDemo th = new ThreadDemo();
		Thread t=new Thread (new ThreadDemo());
		t.start();
		System.out.println(t.getName());

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("My Thread");
	}

}
