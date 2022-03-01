package concurrentPatterns;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex2_1 implements Runnable{

	public static void main(String[] args) {
		ExecutorService s = Executors.newFixedThreadPool(2);
		Ex2_1 e = new Ex2_1();
		s.submit(e);
		s.shutdown();

	}

	@Override
	public void run() {
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

}
