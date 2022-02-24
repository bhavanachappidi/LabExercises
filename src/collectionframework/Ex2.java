package collectionframework;

import java.util.HashMap;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] c = s.toCharArray();
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		hm = countChars(c);
		System.out.println(hm);
		sc.close();

	}
	public static HashMap<Character,Integer> countChars(char[] ch)
	{
		HashMap<Character,Integer> hm1 = new HashMap<Character,Integer>();
		for(char in : ch)
		{
			if(hm1.containsKey(in))
			{
				hm1.put(in, hm1.get(in)+1);
			}
			else
			{
				hm1.put(in,1);
			}
		}
		return hm1;
	}

}
