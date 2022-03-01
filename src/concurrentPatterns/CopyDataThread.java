package concurrentPatterns;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyDataThread extends Thread{
	FileReader fr = null;
	FileWriter fw = null;
	public CopyDataThread(FileReader fis,FileWriter fos)
	{
		fr = fis;
		fw = fos;
		
	}
	public void run()
	{
		
		try
		{
			int n;
			int c=0;
			while((n=fr.read())!=-1)
			{
				fw.write(n);
				c++;
				if(c==10)
				{
					System.out.println("10 characters are copied");
					c=0;
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(fr!=null)
					fr.close();
				
			}
			catch(IOException e1)
			{
				e1.printStackTrace();
			}
			try
			{
				if(fw!=null)
					fw.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
}
}
