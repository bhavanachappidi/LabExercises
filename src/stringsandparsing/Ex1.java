package stringsandparsing;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringTokenizer st = new StringTokenizer(s," ");
		int sum=0;
		while(st.hasMoreTokens())
		{
			String s1 = st.nextToken();
			System.out.println(s1);
			int i = Integer.parseInt(s1);
			sum+=i;
		}
		System.out.println(sum);
		sc.close();
	}

}
