package listDemoExample;

import java.util.ArrayList;

public class ArrayListDemo1
{

	public static void main(String[] args) 
	{
		ArrayList obj1=new ArrayList();
		obj1.add(78787);
		obj1.add('A');
		obj1.add("Selenium Webdriver");
		obj1.add(12.34);
		
	  int myListSize=obj1.size();
	  
	  for(int i=0;i<myListSize;i++)
	  {
		  System.out.println("Values from Array List "+obj1.get(i));
	  }
	}

}
