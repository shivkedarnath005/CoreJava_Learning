package exceptionHandling_22;

import java.awt.Robot;
import java.io.FileInputStream;

public class ExceptionHandleDemo1
{

	public static void main(String[] args) throws Exception //InterruptedException, FileNotFounException, AWTException
	{
		System.out.println("Start");
		
		Thread.sleep(5000);
		
		System.out.println("End");
		
		FileInputStream fis=new FileInputStream("");
		
		Robot a=new Robot();
		
	}

}
