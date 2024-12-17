package com.cts.jsedemo;

import java.util.Scanner;

public class App05WorkingWithStrings {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("A String Please?");
		String s = scan.nextLine();
		
		/*
		String rev= "";		
				
		for(int i=s.length()-1;i>=0;i++) {
			rev += s.charAt(i); //this is a very costly operation, as a new string is created every time.
		}
		*/
		
		String rev = new String( new StringBuilder(s).reverse() );
				
		System.out.println("Reverse is: "+rev);
		System.out.println(rev.equalsIgnoreCase(s) ? "It is a pallendrome": "It is not a pallendrome");
		
		scan.close();
	}
}
