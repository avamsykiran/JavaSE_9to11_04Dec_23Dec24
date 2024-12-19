package com.cts.jsedemo.services;

import com.cts.jsedemo.exception.InsufficientBalanceException;
import com.cts.jsedemo.exception.InvalidDepositeAmountException;
import com.cts.jsedemo.exception.InvalidWithdrawalAmountException;
import com.cts.jsedemo.models.BankAccount;

public class BankingService {

	public double withdraw(BankAccount acc, double amt) throws InvalidWithdrawalAmountException, InsufficientBalanceException {
		double bal = 0;
		
		if(amt<0) {
			throw new InvalidWithdrawalAmountException("Negative Amount can not be withdrawn");
		}	
		
		if (acc != null) { //avoiding NullPointerException			
			
			if(amt>acc.getBalance()) {
				throw new InsufficientBalanceException("Not enough balance to withdraw the said amount.");
			}
			
			acc.setBalance(acc.getBalance() - amt);
			bal = acc.getBalance();
		}
		
		return bal;
	}
	
	public double deposite(BankAccount acc, double amt) throws InvalidDepositeAmountException {
		double bal = 0;
		
		if(amt<0) {
			throw new InvalidDepositeAmountException("Negative amoutn can not be deposited!");
		}	
		
		if (acc != null) { //avoiding NullPointerException			
			acc.setBalance(acc.getBalance() + amt);
			bal = acc.getBalance();
		}
		
		return bal;
	}
}
