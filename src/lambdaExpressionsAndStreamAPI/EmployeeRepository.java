package lambdaExpressionsAndStreamAPI;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EmployeeRepository{

		
		public static Map<Integer,Employee> employeeMap = new HashMap<Integer,Employee>();
		public static Set<Department> departments = new HashSet<Department>();
		public static Map<Department,Integer> departmentMap = new HashMap<Department,Integer>();
		
		
		public EmployeeRepository()
		{
			
		}
		public void addEmployee(Employee employee)
		{
			employeeMap.put(employee.employeeId, employee);
		}
		public void addDepartment(Department department)
		{
			departments.add(department);
		}
		
	
		public Department getDepartment(int id)
		{
			for(Department dept:departments)
			{
				if(dept.departmentId==id)
				{
					return dept;
				}
			}
			return null;
		}
		
	public static LocalDate hireD(String date)
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d = LocalDate.parse(date,dtf);
		return d;
	}

}

