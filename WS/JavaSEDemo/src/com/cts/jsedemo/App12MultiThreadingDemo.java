package com.cts.jsedemo;

public class App12MultiThreadingDemo {

	public static void main(String[] args) {
		
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName());
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Application Terminated");
	}

}
