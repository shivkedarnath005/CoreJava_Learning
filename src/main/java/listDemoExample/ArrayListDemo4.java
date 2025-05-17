package listDemoExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo4
{

	public static void main(String[] args) 
	{
		ArrayList obj1=new ArrayList();
		
		obj1.add("Amol");
		obj1.add("Selenium");
		obj1.add("WEBDRIVER");
		obj1.add("Deokar");
		
		Iterator itr=obj1.iterator();
		
		while(itr.hasNext())
		{
			Object value=itr.next();
			System.out.println("Values are "+value);
		}
		
	}

}
