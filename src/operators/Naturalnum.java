package operators;

import java.util.Scanner;

public class Naturalnum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(calculateSum(n));
		sc.close();

	}
	//CalculateSum
			public static int calculateSum(int n)
			{
				int sum=0;
				for(int i=1;i<=n;i++)
				{
				if(i%3==0||i%5==0)
				{
					sum+=i;
				}
				}
				return sum;
			}

}
