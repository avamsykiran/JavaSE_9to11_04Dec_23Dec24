package com.cts.jsedemo.services;

import java.util.ArrayList;
import java.util.List;

import com.cts.jsedemo.models.Bus;

public class ReservationService implements Runnable {

	private Bus bus;
	private int seatCount;
	private List<Integer> reservedSeats;	
	
	public ReservationService(Bus bus, int seatCount) {
		super();
		this.bus = bus;
		this.seatCount = seatCount;
		this.reservedSeats = new ArrayList<>();
	}

	@Override
	public void run() {
		String tname = Thread.currentThread().getName();
		System.out.println(tname +" Reservation Started!");
		
		for(int i=1;i<=seatCount && !bus.isBusFull();i++) {
			synchronized (bus) {
				int reservedSeat = bus.getLastReservedSeat() +1;
				this.reservedSeats.add(reservedSeat);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {			
					e.printStackTrace();
				}
				System.out.println(tname +" Seat Number "+reservedSeat+" is reserved!");
				bus.setLastReservedSeat(reservedSeat);	
			}
		}
		
		System.out.println(tname +" Reservation Completed!");
	}

	public List<Integer> getReservedSeats() {
		return reservedSeats;
	}	
}
