package lambdaExpressionsAndStreamAPI;

import java.time.LocalDate;


public class Employee {
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", phoneNum=" + phoneNum + ", hireDate=" + hireDate + ", designation=" + designation
				+ ", salary=" + salary + ", managerId=" + managerId + ", dept=" + dept + "]";
	}
	public int employeeId;
	public String firstName;
	public String lastName;
	public String email;
	public String phoneNum;
	public LocalDate hireDate;
	public String designation;
	public double salary;
	public int managerId;
	public Department dept;
	public Employee(int employeeId, String firstName, String lastName, String email, String phoneNum,
			LocalDate hireDate, String designation, double salary, int managerId, Department dept) {
		
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNum = phoneNum;
		this.hireDate = hireDate;
		this.designation = designation;
		this.salary = salary;
		this.managerId = managerId;
		this.dept = dept;
	}
	public Employee(int employeeId, String firstName, String lastName, String email, String phoneNum,
			LocalDate hireDate, String designation, double salary, int managerId)
	{
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNum = phoneNum;
		this.hireDate = hireDate;
		this.designation = designation;
		this.salary = salary;
		this.managerId = managerId;
	}
	public Employee(Department dept)
	{
		this.dept = dept;
	}
}
