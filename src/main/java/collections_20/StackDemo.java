package collections_20;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo
{

	public static void main(String[] args) 
	{
		Stack<String> obj=new Stack<String>();
		obj.push("Item1");
		obj.push("Item2");
		obj.push("Item3");
		obj.push("Item4");
		obj.add("Item5");
		System.out.println(obj);
		obj.pop();
		System.out.println(obj);
		obj.remove("Item3");
		System.out.println(obj);
		System.out.println(obj.peek());
		
		Iterator itr=obj.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	
	}

}
