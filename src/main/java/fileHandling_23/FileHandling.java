package fileHandling_23;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

	
	public static void main(String[] args) throws IOException 
	{
		//Creating File
		File obj = new File("./File/myfile1.txt");
		obj.createNewFile();
		System.out.println("New File Created : "+ obj.getName());
		
		//Writing file
		FileWriter writer = new FileWriter("./File/myfile1.txt");
		writer.write("Files in java are seriously good to use");
		writer.close();
		System.out.println("File successfully written");
		
		//Reading file
		File obj1 = new File("./File/myfile1.txt");
		Scanner reader = new Scanner(obj1);
		while(reader.hasNextLine())
		{
			String data = reader.nextLine();
			System.out.println(data);
		}
		reader.close();
		
		//Delete File
		obj.delete();
		System.out.println("File Deleted : "+ obj.getName());
		
		

	}

}
