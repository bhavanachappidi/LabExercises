package exceptionhandling;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String name;
		name="";
		System.out.println("Enter first name : ");
		String fname=sc.nextLine();
		System.out.println("Enter last name : ");
		String lname = sc.nextLine();
		name = fname+lname;
		try {
			validate(name);
		} catch (InvalidNameException e) 
		{
		}
		sc.close();
	}
	public static void validate(String str) throws InvalidNameException
	{
		if(str.isEmpty())
		{
			throw new InvalidNameException("Invalid Name");
		}
		else
		{
			System.out.println("Valid name");
		}
	}
}
@SuppressWarnings("serial")
class InvalidNameException extends Exception
{
	public InvalidNameException(String s)
	{
		System.out.println(s);
	}
}