package com.cts.jsedemo.models;

import java.util.Objects;

public class Bus {

	private int maxSeats;
	private int lastReservedSeat;
	
	public Bus(int maxSeats) {	
		this.maxSeats = maxSeats;
		this.lastReservedSeat=0;
	}

	public int getLastReservedSeat() {
		return lastReservedSeat;
	}

	public void setLastReservedSeat(int lastReservedSeat) {
		this.lastReservedSeat = lastReservedSeat;
	}

	public int getMaxSeats() {
		return maxSeats;
	}
	
	public boolean isBusFull() {
		return this.lastReservedSeat == this.maxSeats;
	}

	@Override
	public int hashCode() {
		return Objects.hash(lastReservedSeat, maxSeats);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bus other = (Bus) obj;
		return lastReservedSeat == other.lastReservedSeat && maxSeats == other.maxSeats;
	}

	@Override
	public String toString() {
		return "Bus [maxSeats=" + maxSeats + ", lastReservedSeat=" + lastReservedSeat + "]";
	}
		
}
