package com.cts.jsedemo.models;

public interface AdBoard {

	public static final double PI = 3.14;
	
	double getArea();
	double getPerimeter();
	
	default double estimatePainingCost(double unitRate) {
		return getArea()*unitRate;
	}
	
	default double estimateBorderingCost(double unitRate) {
		return getPerimeter()*unitRate;
	}
}
