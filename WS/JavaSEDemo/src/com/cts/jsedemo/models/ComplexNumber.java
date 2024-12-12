package com.cts.jsedemo.models;

import java.util.Objects;

public class ComplexNumber {

	private int real;
	private int img;
			
	public ComplexNumber() {
		this(3,4);
	}
	
	public ComplexNumber(int real, int img) {	
		this.real = real;
		this.img = img;
	}
	
	public ComplexNumber(ComplexNumber c) {
		this(c.real,c.img);
	}

	public int getReal() {
		return real;
	}
	
	public void setReal(int real) {
		this.real = real;
	}
	
	public int getImg() {
		return img;
	}
	
	public void setImg(int img) {
		this.img = img;
	}

	@Override
	public int hashCode() {
		return Objects.hash(img, real);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ComplexNumber other = (ComplexNumber) obj;
		return img == other.img && real == other.real;
	}

	@Override
	public String toString() {
		return "ComplexNumber [real=" + real + ", img=" + img + "]";
	}
}
