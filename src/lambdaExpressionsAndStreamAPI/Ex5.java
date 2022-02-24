package lambdaExpressionsAndStreamAPI;
interface Fact
{
	int f(int num);
}
class Demo
{
	public int factorial(int num)
	{
		if(num==0)
			return 1;
		else
			return (num*factorial(num-1));
	}
}
public class Ex5 {

	public static void main(String[] args) {
		Demo d = new Demo();
		Fact fres = d::factorial;
		System.out.println(fres.f(4));

	}

}
