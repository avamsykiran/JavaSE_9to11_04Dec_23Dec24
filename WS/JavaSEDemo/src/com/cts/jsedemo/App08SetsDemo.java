package com.cts.jsedemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.cts.jsedemo.models.Employee;
import com.cts.jsedemo.models.Manager;
import com.cts.jsedemo.utils.CompareEmployeeOnName;

public class App08SetsDemo {

	public static void main(String[] args) {

		Set<Employee> emps = new TreeSet<>(new CompareEmployeeOnName()); //new TreeSet<>(); //new LinkedHashSet<>(); //new HashSet<>();

		emps.add(new Employee(12, "Zeenath", 12000, 345));
		emps.add(new Employee(10, "Aruna", 13000, 445));
		emps.add(new Manager(4, "Arjun", 25000, 1200, 1500));
		emps.add(new Manager(2, "Shyamala", 35000, 1200, 2200));
		emps.add(new Manager(5, "Kapil", 35000, 1200, 3200));
		emps.add(new Employee(13, "Danial", 10000, 145));
		emps.add(new Employee(15, "Charles", 19000, 745));
		emps.add(new Employee(11, "Bhargav", 17000, 845));
		emps.add(new Manager(2, "Vamsy", 25000, 1200, 1200));
		emps.add(new Manager(1, "Raghav", 55000, 1200, 5200));

		for (Employee e : emps) {
			System.out.println(e);
		}

		System.out.println("-------------------------------------------------------");
	}

}
