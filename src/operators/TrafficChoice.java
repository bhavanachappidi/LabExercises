package operators;

import java.util.Scanner;

public class TrafficChoice {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a choice : red/yellow/green");
		String s = sc.next();
		switch(s)
		{
		case "red":
			System.out.println("stop");
			break;
		case "yellow":
			System.out.println("ready");
			break;
		case "green":
			System.out.println("go");
			break;
		default :
			System.out.println("Enter valid choice");
		}
		sc.close();
		
	}

}
