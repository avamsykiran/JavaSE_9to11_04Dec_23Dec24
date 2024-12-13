package com.cts.jsedemo;

import com.cts.jsedemo.models.ContractEmployee;
import com.cts.jsedemo.models.Director;
import com.cts.jsedemo.models.Employee;
import com.cts.jsedemo.models.Manager;

public class App03InheretencePolymorphisimAndDynamicBindingDemo {

	public static void main(String[] args) {

		Employee emp = new Employee(101, "Vamsy",45000, 1000);
		Manager mgr = new Manager(102, "Sruthi",45000, 1000,900);
		Director dir = new Director(103, "Murthy", 45000, 1000, 900, 1200);
		ContractEmployee cemp = new ContractEmployee(104,"Ramesh", 45000, 1000, 10);
		
		System.out.println(emp);
		System.out.println(mgr);
		System.out.println(dir);
		System.out.println(cemp);
	}

}
