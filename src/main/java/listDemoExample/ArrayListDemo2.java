package listDemoExample;

import java.util.ArrayList;

public class ArrayListDemo2
{

	public static void main(String[] args) 
	{
		ArrayList obj1=new ArrayList();
		obj1.add(78787);
		obj1.add('A');
		obj1.add("Selenium Webdriver");
		obj1.add(12.34);
		
		for(Object abc:obj1) //Enhanced for loop
		{
			System.out.println("Values are "+abc);
		}

	}

}
