package com.cts.jsedemo;

import com.cts.jsedemo.models.Bus;
import com.cts.jsedemo.services.ReservationService;

public class App13MultiThreadingDemo {

	public static void main(String[] args) {
		
		Bus b1 = new Bus(15);
		Bus b2 = new Bus(10);
		
		ReservationService rs1 = new ReservationService(b1, 10);
		ReservationService rs2 = new ReservationService(b2, 5);
		
		Thread t1 = new Thread(rs1,"T1");
		Thread t2 = new Thread(rs2,"T2");
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
				
		System.out.println(rs1.getReservedSeats() +" are seats reserved for T!");
		System.out.println(rs2.getReservedSeats() +" are seats reserved for T2");
	}

}
