package collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int[] r = getSorted(arr);
		System.out.println(Arrays.toString(r));
		sc.close();
	}
	public static int[] getSorted(int[] a)
	{
		int n = a.length;
		int[] res = new int[n];
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			String s = String.valueOf(a[i]);
			String s1 = "";
			for(int j=s.length()-1;j>=0;j--)
			{
				s1 = s1+s.charAt(j);
			}
			al.add(Integer.parseInt(s1));
		}
		Collections.sort(al);
		int i=0;
		for(int k : al)
		{
			res[i++]=k;
		}
		
		return res;
	}

}
