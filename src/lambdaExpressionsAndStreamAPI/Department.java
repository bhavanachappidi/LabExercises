package lambdaExpressionsAndStreamAPI;

public class Department {
	public int departmentId;
	public String departmentName;
	public int managerId;
	public Department()
	{
		
	}
	public Department(int departmentId, String departmentName, int managerId) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.managerId = managerId;
	}
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", managerId="
				+ managerId + "]";
	}
	
	
}
