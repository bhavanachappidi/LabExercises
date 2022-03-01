package concurrentPatterns;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import multithreading.CopyDataThread;

public class FileProgram {

	public static void main(String[] args) throws IOException {
		FileReader fis = new FileReader("D:\\Source1.txt");
		FileWriter fos = new FileWriter("D:\\Target1.txt");
		ExecutorService s = Executors.newFixedThreadPool(2);
		CopyDataThread cd =new CopyDataThread(fis,fos);
		s.submit(cd);
		s.shutdown();

	}

}
