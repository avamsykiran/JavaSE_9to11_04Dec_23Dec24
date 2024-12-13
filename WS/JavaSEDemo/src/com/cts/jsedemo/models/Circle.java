package com.cts.jsedemo.models;

import java.util.Objects;

public class Circle implements AdBoard {

	private double radius;
	
	public Circle() {
		//left blank
	}
		
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return PI * radius*radius;
	}

	@Override
	public double getPerimeter() {
		return 2*PI*radius;
	}

	@Override
	public int hashCode() {
		return Objects.hash(radius);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		return Double.doubleToLongBits(radius) == Double.doubleToLongBits(other.radius);
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	
}
