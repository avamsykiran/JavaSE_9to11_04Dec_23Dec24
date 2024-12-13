package com.cts.jsedemo.models;

import java.util.Objects;

public class Rectangle implements AdBoard {

	private int length;
	private int breadth;
	
	public Rectangle() {
		//left blank
	}
			
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(breadth, length);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		return breadth == other.breadth && length == other.length;
	}

	@Override
	public double getArea() {
		return this.length*this.breadth;
	}

	@Override
	public double getPerimeter() {
		return 2*(this.length+this.breadth);
	}
	
}
