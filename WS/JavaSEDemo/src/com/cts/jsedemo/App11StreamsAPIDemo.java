package com.cts.jsedemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.cts.jsedemo.models.Employee;
import com.cts.jsedemo.models.Manager;

public class App11StreamsAPIDemo {

	public static void main(String[] args) {
	
		List<Employee> emps = new ArrayList<>();

		emps.add(new Employee(12, "Zeenath", 12000, 345));
		emps.add(new Employee(10, "Aruna", 13000, 445));
		emps.add(new Manager(4, "Arjun", 25000, 1200, 1500));
		emps.add(new Manager(3, "Shyamala", 35000, 1200, 2200));
		emps.add(new Manager(5, "Kapil", 35000, 1200, 3200));
		emps.add(new Employee(13, "Danial", 10000, 145));
		emps.add(new Employee(15, "Charles", 19000, 745));
		emps.add(new Employee(11, "Bhargav", 17000, 845));
		emps.add(new Manager(2, "Vamsy", 25000, 1200, 1200));
		emps.add(new Manager(1, "Raghav", 55000, 1200, 5200));
		
		emps.stream().forEach(System.out::println);
		System.out.println("-----------------------------------");

		emps.stream().forEach( emp -> { emp.setSalary(emp.getSalary() + emp.getSalary()*0.05); } );
		emps.stream().forEach(System.out::println);
		System.out.println("-----------------------------------");

		Map<Integer,Employee> empsMap = emps.stream().collect(Collectors.toMap(Employee::getEmpId,emp -> emp));
		System.out.println(empsMap);
		System.out.println("-----------------------------------");

		List<String> empsNamesList = emps.stream().map( emp -> emp.getFullName() ).collect(Collectors.toList());
		System.out.println(empsNamesList);
		System.out.println("-----------------------------------");

		Optional<Employee> result = emps.stream().reduce((e1,e2) -> e1.getNetPay()>e2.getNetPay()?e1:e2 );
		System.out.println(result.get());
		System.out.println("-----------------------------------");

		List<String> mgrsNamesList = emps.stream()
			.filter( emp -> emp instanceof Manager)
			.map( emp -> emp.getFullName() )
			.map(String::toUpperCase)
			.collect(Collectors.toList());
		System.out.println(mgrsNamesList);
		System.out.println("-----------------------------------");

	}

}
