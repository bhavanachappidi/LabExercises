package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		for(int i=0;i<n;i++)
		{
			s[i]=sc.next().toLowerCase();
		}
		String[] res=sortStrings(s);
		System.out.println(Arrays.toString(res));
		sc.close();
	}
	public static String[] sortStrings(String[] arr)
	{
		int n = arr.length;
		String[] str = new String[n];
		Arrays.sort(arr);
		int m=0;
		if(n%2!=0)
			m=n/2+1;
		else
			m=n/2;
		for(int i=0;i<m;i++)
		{
			str[i]=arr[i].toUpperCase();
		}
		for(int i=m;i<n;i++)
		{
			str[i]=arr[i].toLowerCase();
		}
		return str;
	}

}
