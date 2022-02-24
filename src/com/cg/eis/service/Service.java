package com.cg.eis.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.cg.eis.bean.Employee;


public class Service {
	EmployeeService ess;
	public interface EmployeeService {
		
		void add(Employee em);
		void delete(Integer ID);
		String display(String ischeme);

		class Services implements Service.EmployeeService {
			public static HashMap<Integer, Employee> hm = new HashMap<Integer, Employee>();

			@Override
			public  void add(Employee em) {
				hm.put(em.id, em);
			}

			@Override
			public void delete(Integer ID) {
				hm.remove(ID);
			}
			public String display(String ischeme)
			{
	
				Set<Map.Entry<Integer,Employee>> m = hm.entrySet();
				for(Map.Entry<Integer,Employee> s : m)
				{
					Employee ob =s.getValue();
					if(ischeme.equalsIgnoreCase(ob.getIscheme(ob.salary)))
					{
						return "Name : "+ob.name+" ID : "+ob.id+" Salary : "+ob.salary+" Designation : "+ob.desgination;
					}
				}
				return null;
			}

		}
	}
	

}
