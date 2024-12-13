package com.cts.jsedemo;

import com.cts.jsedemo.models.ComplexNumber;

public class App02ClassAndObjectDemo {

	public static void main(String[] args) {
		
		ComplexNumber c1 = new ComplexNumber();
		ComplexNumber c2 = new ComplexNumber(5,16);		
		ComplexNumber c3 = c2;
		ComplexNumber c4 = new ComplexNumber(c2);
		ComplexNumber c5 = ComplexNumber.sum(c2, c4);
		
		System.out.println(c1);
		System.out.println(c1.hashCode());
		
		System.out.println(c2);
		System.out.println(c2.hashCode());
		
		System.out.println(c3);
		System.out.println(c3.hashCode());
		
		System.out.println(c4);
		System.out.println(c4.hashCode());
		
		System.out.println(c5);
		System.out.println(c5.hashCode());
				
		System.out.println(c2.equals(c3));
		System.out.println(c2.equals(c4));
	}

}
