package lambdaExpressionsAndStreamAPI;
interface Inf1
{
	String spce(String str);
}
public class Ex2 {

	public static void main(String[] args) {
		Inf1 res = (s)->s.replace("", " ");
		System.out.println(res.spce("JAYA"));
	}

}
