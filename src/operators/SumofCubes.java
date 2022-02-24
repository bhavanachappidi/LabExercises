package operators;

import java.util.Scanner;

public class SumofCubes {
	public static void main(String[] args)
	{
		int p,sum = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n!=0)
		{
			p = n%10;
			n = n/10;
			sum += p*p*p;
			
			
		}
		System.out.println(sum);
		sc.close();
	}

}
