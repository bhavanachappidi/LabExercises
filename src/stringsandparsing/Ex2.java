package stringsandparsing;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringBuffer sb = new StringBuffer(s);
		System.out.println(s+"|"+sb.reverse());
		sc.close();
		
	}

}
