package com.cts.jsedemo;

import java.util.Scanner;

import com.cts.jsedemo.exception.InsufficientBalanceException;
import com.cts.jsedemo.exception.InvalidDepositeAmountException;
import com.cts.jsedemo.exception.InvalidWithdrawalAmountException;
import com.cts.jsedemo.models.BankAccount;
import com.cts.jsedemo.services.BankingService;

public class App06ExceptionHandlingDemo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		BankAccount acc = new BankAccount(5000);
		BankingService bs = new BankingService();
		
		String choice = "";
		
		while(!"quit".equalsIgnoreCase(choice)) {
			System.out.println("Choice: (deposite/withdraw/quit): ");
			choice = scan.nextLine().toLowerCase();
			
			switch(choice) {
			case "deposite": 
				System.out.println("Amount? ");
				while(!scan.hasNextDouble()) { //avoiding InputMismatchException
					System.out.println("Expecting a number");
					scan.nextLine();
				}
				double depositeAmount = scan.nextDouble();
				
				try {
					double balAfterDeposite = bs.deposite(acc, depositeAmount);
					System.out.println("Deposited!@ Current Balance: "+balAfterDeposite);
				} catch (InvalidDepositeAmountException e) {
					System.out.println(e.getMessage());
				}
				
				break;
			case "withdraw":
				System.out.println("Amount? ");
				while(!scan.hasNextDouble()) {//avoiding InputMismatchException
					System.out.println("Expecting a number");
					scan.nextLine();
				}
				double withdrawAmount = scan.nextDouble();
				
				try {
					double balAfterWithdral = bs.withdraw(acc, withdrawAmount);
					System.out.println("Withdrawen!@ Current Balance: "+balAfterWithdral);
				} catch (InvalidWithdrawalAmountException | InsufficientBalanceException e) {
					System.out.println(e.getMessage());
				}
				break;
			case "quit":
				System.out.println("Thank you! Visit Again!");
				break;
			default:
				System.out.println("Unknwon choice");
			}
		}
		
		scan.close();
	}

}
