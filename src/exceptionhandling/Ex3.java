package exceptionhandling;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter salary: ");
		int sal = sc.nextInt();
		try
		{
			validate(sal);
		}
		catch(InvalidSalaryException e)
		{
			System.out.println(e);
		}
		sc.close();
		
	}
	public static void validate(int n) throws InvalidSalaryException
	{
		if(n<3000)
			throw new InvalidSalaryException("Invalid salary");
		else
			System.out.println("Valid salary");
	}
}
@SuppressWarnings("serial")
class InvalidSalaryException extends Exception
{
	public InvalidSalaryException(String str)
	{
		super(str);
	}
}
