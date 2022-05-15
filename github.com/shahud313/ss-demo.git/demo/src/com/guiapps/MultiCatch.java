package com.guiapps;

public class MultiCatch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,20};
		int div = 20;
		try {
		int ans = arr[2]/div - arr[1];
		//Exception(arr[2] is not available
		}
		catch(ArithmeticException e) {
			System.out.println("Catch Division by Zero");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Catch Array index error");
		}
		catch(ArrayStoreException e) {
			System.out.println("Illigal data type ");
		}
		finally {
			int out = arr[1]/arr[0];
			System.out.println("Output = " + out);
		}
	}
}
