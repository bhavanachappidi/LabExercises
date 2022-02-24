package lambdaExpressionsAndStreamAPI;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


import java.util.List;

import java.util.stream.Collectors;


public class EmployeeService {
	public static void main(String[] args)
	{
	EmployeeRepository empres = new EmployeeRepository();
	
	Department d1 = new Department(3001,"SE",2001);
	Employee emp1 = new Employee(1001,"John","Stephen","johnstephen@gmail.com","9876543210",hireD("13/01/2018"),"A4",40000,2001,d1);

	
	
	Department d2 = new Department(3002,"BC",2002);
	Employee emp2 = new Employee(1002,"Shyama","Ram","shyamram@gmail.com","9812873444",hireD("22/08/2012"),"BDA",20000,2002,d2);
	
	
	
	Department d3 = new Department(3003,"SE",2003);
	Employee emp3 = new Employee(1003,"Rama","Rao","ramarao@gmail.com","8769543211",hireD("03/09/2020"),"A5",35000,2003,d3);
	
	
	
	empres.addEmployee(emp1);
	empres.addEmployee(emp2);
	empres.addEmployee(emp3);
	
	
	empres.addDepartment(d1);
	empres.addDepartment(d2);
	empres.addDepartment(d3);
	
	
	System.out.println(sumOfSalary());
	
	
	System.out.println();
	empCount();
	
	
	System.out.println();
	System.out.println("Senior Most Employee : Name - "+seniorEmp().firstName+" "+seniorEmp().lastName+" ,Designation - "+seniorEmp().designation);
	
	
	System.out.println();
	empDuration();
	
	Employee emp4 = new Employee(1004,"Barry","Allen","barry@gmail.com","9876067890",hireD("18/03/2010"),"A4",25000,2004);
	empres.addEmployee(emp4);
	System.out.println();
	System.out.println(withoutDept());
	
	
	Department d4 = new Department(4004,"Marketing",2340);
	Employee emp5 = new Employee(d4);
	empres.addEmployee(emp5);
	empres.addDepartment(d4);
	System.out.println();
	System.out.println(withoutEmp());
	
	}
	//sum of salaries of all employees
	public static double sumOfSalary()
	{
		return EmployeeRepository.employeeMap.values().stream().mapToDouble(x->x.salary).reduce(0, Double::sum);
	}
	//department and no.of employees in each department
	public static void empCount()
	{
		EmployeeRepository.employeeMap.values().stream().forEach(e->
		{
			long empC = EmployeeRepository.employeeMap.values().stream().filter(x->
			(x.dept!=null)&&(e.dept.departmentName==x.dept.departmentName)
			).count();
		
			System.out.println(e.dept.departmentName+" - "+ empC);
		});
	}
	
	//senior most employee
	public static Employee seniorEmp()
	{
		return EmployeeRepository.employeeMap.values().stream().min((x,y)->x.hireDate.compareTo(y.hireDate)).get();
	}
	
	//Employee duration in months and days
	public static void empDuration()
	{
		EmployeeRepository.employeeMap.values().stream().forEach(e->
		{
			LocalDate curdate = LocalDate.now();
			Period diff = Period.between(e.hireDate, curdate);
			System.out.println(e.firstName+" "+e.lastName+" - Duration : "+diff.getMonths()+" Months "+diff.getDays()+" Days");
		});
	}
	
	//Employees without department
	public static List<Employee> withoutDept()
	{
		return EmployeeRepository.employeeMap.values().stream().filter(e->e.dept==null).collect(Collectors.toList());
	}
	
	//Department without Employees
	public static List<Employee> withoutEmp()
	{
		return EmployeeRepository.employeeMap.values().stream().filter(e->(e.dept!=null)&&(e.designation==null)).collect(Collectors.toList());
	}
	
	
	
	
	
	
	
	public static LocalDate hireD(String date)
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d = LocalDate.parse(date,dtf);
		return d;
	}
	
	
}
