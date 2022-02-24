package stringsandparsing;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l=0;
		int w=0;
		int c=0;
		
		while (sc.hasNextLine()) {
			 String line = sc.nextLine();
			 if(line.length()==0)
				 break;
			 w+=line.split(" ").length;
			 c+=line.length();
			 l++;
		}
		sc.close();
		
		System.out.println("Number of characters : "+c);
		System.out.println("Number of words : "+w);
		System.out.println("Number of lines : "+l);
		}
		

	}


