package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int[] r = modifyArray(arr);
		System.out.println(Arrays.toString(r));
		
		sc.close();
	}
	public static int[] modifyArray(int[] a)
	{
		int n = a.length;
		Arrays.sort(a);
		int[] temp = new int[n];
		int j=0;
		for(int i=0;i<n-1;i++)
		{
			if(a[i]!=a[i+1])
				temp[j++]=a[i];
		}
		temp[j++]=a[n-1];
		System.out.println(j);
		int[] res = new int[j];
		for(int i=0;i<j;i++)
		{
			res[i]=temp[i];
		}
		return res;
	}

}
