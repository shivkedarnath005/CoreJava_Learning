package iterativeStatements_7;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorLoop
{
	public static void main(String[] args)
	{
		ArrayList obj=new ArrayList(); // non generic list object class
		obj.add(10); //add() is standard method in ArrayList class
		obj.add("Hello"); //all types data type entered
		obj.add('a');
		obj.add(2.5f);
		System.out.println(obj); //print the single object content
		
		int myListSize=obj.size();
		  
		for(int i=0;i<myListSize;i++) //print all values objects in ArrayList
		{
	      System.out.println("Values from Array List "+obj.get(i));
		}
		
		for(Object abc:obj) //Enhanced for loop, Object class variable as loop variable
	    {
		 System.out.println("Values are "+abc);
		}
		
		Iterator itr=obj.iterator(); //Use Iterator object variable for while loop
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
