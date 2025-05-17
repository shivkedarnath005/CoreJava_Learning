package practice;

import java.io.File;

public class DeleteFile 
{

	public static void main(String[] args) 
	{
		File obj = new File("./File/myfile.txt");
		
		if(obj.delete())
		{
			System.out.println("File Deleted : "+ obj.getName());
		}
		else
		{
			System.out.println("File not deleted");
		}

	}

}
