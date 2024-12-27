package com.cts.jsedemo.utils;

import java.util.Comparator;

import com.cts.jsedemo.models.Employee;

public class CompareEmployeeOnNetPay implements Comparator<Employee> {
	
	@Override
	public int compare(Employee o1, Employee o2) {
		return ((Double)o1.getNetPay()).compareTo(o2.getNetPay());
	}

}
