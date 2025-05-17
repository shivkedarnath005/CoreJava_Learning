package listDemoExample;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo5
{

	public static void main(String[] args) 
	{
		ArrayList obj1=new ArrayList();
		//Any data type and any number of values can be aded in the arraylist
		obj1.add(78787);
		obj1.add('A');
		obj1.add("Selenium Webdriver");
		obj1.add(12.34);
		
		Iterator itr=obj1.iterator();
		
		while(itr.hasNext())
		{
			Object value=itr.next();
			System.out.println("Values are "+value);
		}
		

	}

}
