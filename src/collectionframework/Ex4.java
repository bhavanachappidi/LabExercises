package collectionframework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students : ");
		int n = sc.nextInt();
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++)
		{
			int reg = sc.nextInt();
			int mark = sc.nextInt();
			hm.put(reg,mark);
		}
		HashMap<Integer,String> hm1 = new HashMap<Integer,String>();
		hm1 = getStudents(hm);
		System.out.println(hm1);
		sc.close();
		
	}
	public static HashMap<Integer,String> getStudents(HashMap<Integer,Integer> h)
	{
		HashMap<Integer,String> hm2 = new HashMap<Integer,String>();
		Set<Map.Entry<Integer,Integer>> s = h.entrySet();
		for(Map.Entry<Integer, Integer> marks : s)
		{
			if(marks.getValue()>=90)
			{
				hm2.put(marks.getKey(),"Gold");
			}
			else if(marks.getValue()>=80)
			{
				hm2.put(marks.getKey(), "Silver");
			}
			else if(marks.getValue()>=70)
			{
				hm2.put(marks.getKey(), "Bronze");
			}
		}
		return hm2;
	}
}
