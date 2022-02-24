package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int[] result =getSorted(arr);
		System.out.println(Arrays.toString(result));
		sc.close();

	}
	public static int[] getSorted(int[] s)
	{
		int n = s.length;
		int[] a = new int[n];
		int r=0;
		
		for(int i=0;i<n;i++)
		{
			int rev=0;
			int p = s[i];
			while(p!=0)
			{
				r=p%10;
				rev = rev*10+r;
				p=p/10;
			}
			a[i]=rev;
		}
		Arrays.sort(a);
		return a;
	}

}
