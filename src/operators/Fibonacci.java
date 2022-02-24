package operators;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fibr(n));
		System.out.println(fibnr(n));
		sc.close();

	}

	public static int fibr(int n)
	{
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		return fibr(n-1)+fibr(n-2);
	}
	public static int fibnr(int n)
	{
		int a=1;
		int b=1;
		int c=0;
		if(n==0||n==1)
		{
			return n;
		}
		else
		{
		for(int i=2;i<n;i++)
		{
			c=a+b;
			a=b;
			b=c;
		}
		
		return c;
		}
	}
	
}

