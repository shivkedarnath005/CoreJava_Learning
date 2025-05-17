package listDemoExample;

import java.util.ArrayList;

public class ArrayListDemo
{

	public static void main(String[] args) 
	{
		ArrayList obj1=new ArrayList(); //non generic array list
		//Any data type and any number of values can be added in the arraylist
		obj1.add(78787);
		obj1.add('A');
		obj1.add("Selenium Webdriver");
		obj1.add(12.34);
		
		System.out.println(obj1);
		System.out.println(obj1.get(3));
		

	}

}
