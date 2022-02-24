package exceptionhandling;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		try
		{
			validate(age);
		}
		catch(InvalidAgeException e)
		{
			
		}
		sc.close();

	}
	public static void validate(int n) throws InvalidAgeException
	{
		if(n<15)
			throw new InvalidAgeException("Invalid age");
		else
			System.out.println("Welcome");
	}

}
@SuppressWarnings("serial")
class InvalidAgeException extends Exception
{
	

	public InvalidAgeException(String str)
	{
		System.out.println(str);
	}
}