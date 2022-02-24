package collectionframework;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> hm = new HashMap<Integer,String>();
		System.out.println("Enter the num of details you would like to add : ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter the Id of "+i+"th Person : ");
			int id = sc.nextInt();
			System.out.println("Enter dob in YYYY-MM-DD format : ");
			String dob = sc.next();
			hm.put(id,dob);
		}
		List<Integer> list = votersList(hm);
		System.out.println(list);
		
		sc.close();
	}
	public static List<Integer> votersList(HashMap<Integer,String> hashmap)
	{
		Set<Map.Entry<Integer, String>> s = hashmap.entrySet();
		List<Integer> l = new ArrayList<Integer>();
		for(Map.Entry<Integer, String> d : s)
		{
			String dob = d.getValue();
			LocalDate cd = LocalDate.parse(dob);
			LocalDate n = LocalDate.now();
			int y=0;
			if(cd!=null && n!=null)
			{
				y = Period.between(cd, n).getYears();
			}
			
			if(y>18)
			{
				l.add(d.getKey());
			}
		}
		return l;
	}

}
