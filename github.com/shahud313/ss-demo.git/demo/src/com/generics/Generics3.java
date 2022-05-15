package com.generics;

class GenericsClass1 <T extends Number> {

	  public void display() {
	    System.out.println("This is a bounded type generics class.");
	  }
	}

public class Generics3 {
	public static void main(String[] args) {

	    // create an object of GenericsClass

		// In this case, we will get the error.
	// GenericsClass<String> obj = new GenericsClass<>();
	  }
}