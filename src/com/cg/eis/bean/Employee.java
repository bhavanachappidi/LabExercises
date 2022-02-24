package com.cg.eis.bean;

public class Employee {

		public int id;
		public String name;
		public double salary;
		public String desgination;
		public static String ischeme;
		public Employee()
		{
			
		}
		public Employee(int id,String name,double salary,String desgination)
		{
			this.id=id;
			this.name=name;
			this.salary=salary;
			this.desgination=desgination;
			Employee.ischeme = getIscheme(this.salary);
		}
		public String getIscheme(double sal) {
			if(sal>5000 && sal<20000)
				ischeme = "Scheme C";
			else if(sal>=20000 && sal<40000)
				ischeme = "Scheme B";
			else if(sal>=40000)
				ischeme = "Scheme A";
			else if(sal<5000)
				ischeme = "No Scheme";
			return ischeme;
		}
		


}
