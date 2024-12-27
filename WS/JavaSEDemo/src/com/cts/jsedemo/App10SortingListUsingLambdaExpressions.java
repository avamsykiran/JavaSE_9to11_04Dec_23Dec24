package com.cts.jsedemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

import com.cts.jsedemo.models.Employee;
import com.cts.jsedemo.models.Manager;

public class App10SortingListUsingLambdaExpressions {

	public static void main(String[] args) {

		Consumer<Object> printer = System.out::println;
		
		List<Employee> emps = new ArrayList<>();

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
		
		//Comparator<Employee> compareEmployeeOnName = (e1,e2) -> e1.getFullName().compareTo(e2.getFullName());	
		//Collections.sort(emps,compareEmployeeOnName);
		
		Collections.sort(emps,(e1,e2) -> e1.getFullName().compareTo(e2.getFullName()));
		for (Employee e : emps) {
			printer.accept(e);
		}

		printer.accept("-------------------------------------------------------");
	}

}
