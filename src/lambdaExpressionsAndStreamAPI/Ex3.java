package lambdaExpressionsAndStreamAPI;
interface Inf
{
	boolean auth(String name,String pas);
}
public class Ex3 {

	public static void main(String[] args) {
		String username="ALEX";
		String password="1234";
		Inf res = (s1,s2)->
		{
			if(s1.equals(username)&&s2.equals(password))
				return true;
			return false;
		};
		System.out.println(res.auth("ALEX", "1234"));

	}

}
