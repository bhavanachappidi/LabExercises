package stringsandparsing;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		char[] c = s.toCharArray();
		
		for(int i=0;i<n;i++)
		{
			int a = c[i];
			if(c[i]!='A'&&c[i]!='E'&&c[i]!='I'&&c[i]!='O'&&c[i]!='U'&&c[i]!='a'&&c[i]!='e'&&c[i]!='i'&&c[i]!='o'&&c[i]!='u')
			{
				a++;
				c[i]=(char)a;
			}
			
		}
		
		String str = String.valueOf(c);
		System.out.println(str);
		sc.close();
	}

}
