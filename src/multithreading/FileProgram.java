package multithreading;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileProgram{

	public static void main(String[] args) throws IOException {
		FileReader fis = new FileReader("D:\\Source.txt");
		FileWriter fos = new FileWriter("D:\\Target.txt");
		try
		{
			CopyDataThread cd =new CopyDataThread(fis,fos);
			cd.start();
		}
		finally
		{
		/*try
		{
			if(fis!=null)
				fis.close();
			
		}
		catch(IOException e1)
		{
			e1.printStackTrace();
		}
		try
		{
			if(fos!=null)
				fos.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}*/
		}
		
	}

}
