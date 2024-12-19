package com.cts.jsedemo.models;

public class BankAccount {

	private double balance;
	
	public BankAccount() {
		//left blank
	}

	public BankAccount(double balance) {
		super();
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	//hashCode, toString, equals will be added.
}
