package com.digitek.MyMath;

public class AddWithPassingValue {
	public static int myAdd(int a,int b) {
		int c=a+b;
		System.out.println("Addition of Two numbers : " +c);
		return c ;
	}
public static void main (String args[]) {
	myAdd(10,20);
}
}
