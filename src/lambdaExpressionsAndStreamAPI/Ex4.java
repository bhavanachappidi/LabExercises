package lambdaExpressionsAndStreamAPI;
interface Intf
{
	public Employee1 getEmp(int age,String name);

	
}
class Employee1
{
	private int age;
	private String name;
	public Employee1(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
}
public class Ex4 {

	public static void main(String[] args) {
		Intf s = Employee1::new;
		System.out.println("Age : "+s.getEmp(26, "Ram").getAge());
		System.out.println("Name : "+s.getEmp(26, "Ram").getName());

	}

}
