package lambdaExpressionsAndStreamAPI;
interface In1
{
	int exp(int m,int n);
}
public class Ex1 {

	public static void main(String[] args) {
		In1 res = (x,y)->(int)Math.pow(x,y);
		System.out.println(res.exp(2, 4));
	}

}
