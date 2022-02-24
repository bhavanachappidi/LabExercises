package operators;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(checkNumber(n));
		sc.close();

	}
	public static boolean checkNumber(int n)
	{
		boolean c=false;
		if(n==0)
			c=false;
		else if(n%2==0)
			c=true;
		return c;
	}

}
