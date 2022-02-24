package operators;

import java.util.Scanner;

public class IncNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(checkNumber(n));
		sc.close();
	}
	public static boolean checkNumber(int n)
	{
		boolean c=true;
		int p = n%10;
		n = n/10;
		while(n!=0)
		{
			if(p<n%10)
			{
				c=false;
			}
			p=n%10;
			n=n/10;
		}
		return c;
		
		
	}

}
