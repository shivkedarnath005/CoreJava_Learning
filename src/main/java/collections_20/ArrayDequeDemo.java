package collections_20;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeDemo 
{

	public static void main(String[] args) 
	{
		Queue<String> obj=new ArrayDeque<String>();
		obj.offer("Reema");
		obj.add("Raj");
		obj.add("Rohan");
		obj.offer("Ajay");
		obj.add("Rashi");
		System.out.println(obj);
		obj.poll();
		System.out.println(obj);
		System.out.println(obj.element());
		obj.remove();
		System.out.println(obj);
		obj.remove();
		System.out.println(obj);
		System.out.println(obj.peek());
	
	}

}
