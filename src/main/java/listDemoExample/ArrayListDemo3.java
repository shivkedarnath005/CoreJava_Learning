package listDemoExample;

import java.util.ArrayList;

public class ArrayListDemo3
{

	public static void main(String[] args) 
	{
		ArrayList<String> obj1=new ArrayList<String>();
		obj1.add("Amol");
		obj1.add("Selenium");
		obj1.add("HP QTP");
		
		for(String v:obj1) //enhanced for loop
		{
			System.out.println(v);
		}
		

	}

}
