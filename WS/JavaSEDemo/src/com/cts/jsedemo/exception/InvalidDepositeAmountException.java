package com.cts.jsedemo.exception;

@SuppressWarnings("serial")
public class InvalidDepositeAmountException extends Exception {

	public InvalidDepositeAmountException() {
		super();
	}

	public InvalidDepositeAmountException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public InvalidDepositeAmountException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidDepositeAmountException(String message) {
		super(message);
	}

	public InvalidDepositeAmountException(Throwable cause) {
		super(cause);
	}
}
