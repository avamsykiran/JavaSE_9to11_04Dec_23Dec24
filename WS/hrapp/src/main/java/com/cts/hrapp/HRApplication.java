package com.cts.hrapp;

import java.util.List;
import java.util.Scanner;

import com.cts.hrapp.exceptions.DatabaseException;
import com.cts.hrapp.model.Employee;
import com.cts.hrapp.service.EmployeeService;
import com.cts.hrapp.service.EmployeeServiceImpl;

public class HRApplication {
 
	private static Scanner scan;
	private static EmployeeService service; 
	
	public static void main(String[] args) {

		scan = new Scanner(System.in);
		service = new EmployeeServiceImpl();
		
		boolean shallContinue = true;
		
		while(shallContinue) {
			System.out.println("Command (DISPLAY/ADD/DELETE/QUIT)? ");
			String cmd = scan.next().toLowerCase();
			
			switch (cmd) {
			case "add": doAdd(); break;
			case "display": doGetAll(); break;
			case "delete": doDelete(); break;
			case "quit": System.out.println("BYE"); shallContinue=false; break;
			default: System.out.println("Invalid Command");	break;
			}
		}
		
		scan.close();
	}
	
	private static void doAdd() {
		Employee emp = new Employee();
		
		System.out.println("Name? ");
		emp.setName(scan.next());
		System.out.println("Salary? ");
		emp.setSalary(scan.nextDouble());
		
		try {
			service.add(emp);
			System.out.println("Employee is saved");
		} catch (DatabaseException e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static void doGetAll() {
		try {
			List<Employee> emps = service.getAll();
			if(emps.isEmpty()) {
				System.out.println("No employee Records In Store");
			}else {
				emps.stream().forEach(System.out::println);
			}			
		} catch (DatabaseException e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static void doDelete() {
		System.out.println("EmpId? ");
		int empId = scan.nextInt();
		try {
			service.deleteById(empId);
			System.out.println("Employee Record Deleted!");
		} catch (DatabaseException e) {
			System.out.println(e.getMessage());
		}
	}

}
