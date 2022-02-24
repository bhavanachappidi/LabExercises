package stringsandparsing;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = Integer.toString(n);
		int l =s.length();
		char[] c = new char[l];
		for(int i=0;i<l;i++)
		{
			c[i]=s.charAt(i);
		}
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<l-1;i++)
		{
			int a = c[i];
			int b = c[i+1];
			int d = Math.abs(a-b);
			String str = Integer.toString(d);
			sb.append(str);
		}
		sb.append(c[l-1]);
		String str = sb.toString();
		int j = Integer.parseInt(str);
		System.out.println(j);
		
		sc.close();
	}

}
