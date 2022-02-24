package com.cg.eis.pl;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.Service;

import com.cg.eis.service.Service.EmployeeService.Services;

public class Source {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			try {
				System.out.println(
						"Press 1: To Add \nPress 2: To Delete \nPress 3: To Get the Employee Details\nPress 4: To exit \n");
				int choice = sc.nextInt();

				Service.EmployeeService obj;
				Services st = new Services();
				obj = st;
				

				if (choice == 1) {
					System.out.println("Enter the no.of Employee details you would like to add : ");

					int n = sc.nextInt();
					for (int i = 1; i <= n; i++) {
						System.out.println("Enter Employee " + i + " ID");
						int EmpID = sc.nextInt();
						System.out.println("Enter Employee " + i + " name");
						String name = sc.next();
						System.out.println("Enter Employee " + i + " Salary");
						double salary = sc.nextDouble();
						System.out.println("Enter Employee " + i + " Designation");
						String desgination = sc.next();
						Employee emp = new Employee(EmpID, name, salary, desgination);
						obj.add(emp);
						System.out.println(Employee.ischeme);
						System.out.println("Employee " + i + " details are successfully added");

					}
					continue;
				} else if (choice == 2) {
					System.out.println("Enter the Employee ID to delete : ");
					int remID = sc.nextInt();
					obj.delete(remID);
					System.out.println("Employee " + remID + " is Deleted");
					continue;
				} else if (choice == 3) {
					System.out.println("Enter the scheme : ");
					sc.nextLine();
					String scheme = sc.nextLine();
					String ans = obj.display(scheme);
					System.out.println(ans);

				} else if (choice == 4) {
					System.exit(0);
					sc.close();
				} else {
					System.out.println("Enter Valid choice");
				}
			}
			catch (InputMismatchException e) {
				String s = sc.next();
				System.out.println("Invalid Input : "+s);
				continue;
			}
		
			
		}

	}
}

