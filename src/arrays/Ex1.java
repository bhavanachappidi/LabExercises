package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(getSecondSmallest(arr));
		sc.close();

	}
	public static int getSecondSmallest(int[] arr)
	{
		Arrays.sort(arr);
		return arr[1];
	}

}
