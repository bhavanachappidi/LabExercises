package stringsandparsing;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean res = isPositive(s);
		System.out.println(res);
		sc.close();

	}
	public static boolean isPositive(String str)
	{
		char[] c = str.toCharArray();
		int n = c.length;
		boolean flag = true;
		for(int i=0;i<n-1;i++)
		{
			int a = c[i];
			int b = c[i+1];
			if(a>b)
			{
				flag=false;
				break;
			}
				
		}
		return flag;
	}

}
