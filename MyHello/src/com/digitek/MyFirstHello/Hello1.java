package com.digitek.MyFirstHello;

import java.util.Scanner;

public class Hello1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please enter some number :");
		Scanner scan = new Scanner(System.in);
		 	double my_number=scan.nextDouble();
		 			
		System.out.println("Entered Number is : "+my_number); 
			if (my_number>=0) {
				System.out.println("Entered Number is Positive.");}
				else {System.out.println("Enterd number is Nagative.");
			}

	}

}
