package operators;

import java.util.Scanner;

public class PrimeNum {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=2;i<n;i++)
		{
			int c=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
					c+=1;
			}
			if(c==0)
			{
				System.out.println(i);
			}
		}
		sc.close();
		
	}

}
