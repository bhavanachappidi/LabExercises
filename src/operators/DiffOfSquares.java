package operators;

import java.util.Scanner;

public class DiffOfSquares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(calculateDifference(n));
		sc.close();

	}
	public static int calculateDifference(int n)
	{
		int s = (n*(n+1))/2;
		int sum1 = s*s;
		
		
		int s2=0;
		int sum2=0;
		for(int i=1;i<=n;i++)
		{
			s2 = i*i;
			sum2 +=s2;
		}
		int res = Math.abs(sum2-sum1);
		return res;
	}
	

}
