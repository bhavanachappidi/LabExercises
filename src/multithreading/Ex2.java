package multithreading;

import java.util.Date;

public class Ex2 implements Runnable{
	public void run()
	{
		while(true)
		{
			Date ld = new Date();
		System.out.println(ld);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
	public static void main(String[] args) {
		Ex2 e = new Ex2();
		Thread t = new Thread(e);
		t.start();
	}

}
