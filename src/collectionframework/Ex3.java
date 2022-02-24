package collectionframework;

import java.util.HashMap;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		hm = getSquares(arr);
		System.out.println(hm);
		sc.close();
		

	}
	public static HashMap<Integer,Integer> getSquares(int[] a)
	{
		HashMap<Integer,Integer> hm1 = new HashMap<Integer,Integer>();
		for(int c : a)
		{
			int sq = c*c;
			hm1.put(c, sq);
		}
		return hm1;
	}

}
