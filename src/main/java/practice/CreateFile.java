package practice;

import java.io.File;
import java.io.IOException;

public class CreateFile 
{

	public static void main(String[] args) 
	{
		try
		{
			File obj = new File("./File/myfile.txt");
			if(obj.createNewFile())
			{
				System.out.println("New File Created : "+ obj.getName());
			}
			else
			{
				System.out.println("File Already Exists ");
			}
		}
		catch(IOException e)
		{
			System.out.println("error occured");
			e.printStackTrace();
		}

	}

}
