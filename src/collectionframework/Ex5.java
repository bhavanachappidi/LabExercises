package collectionframework;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(getSecondSmallest(a));
		
		sc.close();
	}
	public static int getSecondSmallest(int[] arr)
	{
		
		/*ArrayList<Integer> al = new ArrayList<Integer>();
		for(int p : arr)
		{
			al.add(p);
		}
		Collections.sort(al);
		int res = al.get(1);
		return res;*/
		int len = arr.length;
		Integer[] aa = new Integer[len];
		int i=0;
		for(int p : arr)
		{
			aa[i++]=p;
		}
		List<Integer> al = Arrays.asList(aa);
		Collections.sort(al);
		Integer res = (Integer) al.get(1);
		return res;
		
	}

}
