package practice;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile 
{

	public static void main(String[] args) 
	{
		try
		{
			File obj = new File("./File/myfile.txt");
			Scanner reader = new Scanner(obj);
			while(reader.hasNextLine())
			{
				String data = reader.nextLine();
				System.out.println(data);
			}
			reader.close();
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
