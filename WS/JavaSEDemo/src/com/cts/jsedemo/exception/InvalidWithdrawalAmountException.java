package com.cts.jsedemo.exception;

@SuppressWarnings("serial")
public class InvalidWithdrawalAmountException extends Exception {

	public InvalidWithdrawalAmountException() {
		super();
	}

	public InvalidWithdrawalAmountException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public InvalidWithdrawalAmountException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidWithdrawalAmountException(String message) {
		super(message);
	}

	public InvalidWithdrawalAmountException(Throwable cause) {
		super(cause);
	}
}
