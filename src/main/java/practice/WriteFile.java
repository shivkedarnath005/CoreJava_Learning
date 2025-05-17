package practice;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile
{

	public static void main(String[] args) 
	{
		try
		{
			FileWriter writer = new FileWriter("./File/myfile.txt");
			writer.write("Files in java are seriously good to use");
			writer.close();
			System.out.println("File successfully written");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		

	}

}
