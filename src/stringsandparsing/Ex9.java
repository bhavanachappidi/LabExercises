package stringsandparsing;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date in yyyy-mm-dd format");
		String s = sc.next();
		String[] sd = s.split("-");
		int y = Integer.parseInt(sd[0]);
		int m = Integer.parseInt(sd[1]);
		int d = Integer.parseInt(sd[2]);
		
		LocalDate ld = LocalDate.of(y,m,d);
		LocalDate now = LocalDate.now();
		Period diff = Period.between(ld, now);
		System.out.println("Difference is : "+diff.getYears()+" years "+diff.getMonths()+" months "+diff.getDays()+" days ");
		sc.close();

	}

}
