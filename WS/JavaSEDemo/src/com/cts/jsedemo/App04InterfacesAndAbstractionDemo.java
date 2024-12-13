package com.cts.jsedemo;

import com.cts.jsedemo.models.Circle;
import com.cts.jsedemo.models.Rectangle;

public class App04InterfacesAndAbstractionDemo {

	public static void main(String[] args) {
	
		Rectangle r= new Rectangle(10,10);
		Circle c = new Circle(10);
		
		System.out.println(r +", PaintingCost="+r.estimatePainingCost(10) );
		System.out.println(c +", PaintingCost="+c.estimatePainingCost(10) );
	}

}
