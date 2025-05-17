package collections_20;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo 
{

	public static void main(String[] args) 
	{
		LinkedList<String> obj=new LinkedList<>();
		System.out.println("Size of Linked List= "+obj.size());
		obj.add("abc");
		obj.add("kbc");
		obj.add("bbc");
		obj.add("pqr");
		System.out.println("Size of Linked List= "+obj.size());
		System.out.println(obj);
		obj.remove(1);
		System.out.println("After Removing an Object List is ");
		System.out.println(obj);
		obj.set(1, "First Element");
		System.out.println("After Adding an Object List is ");
		System.out.println(obj);
		obj.addFirst("First");
		obj.addLast("Last");
		System.out.println("After Adding First & Last Object List is ");
		System.out.println(obj);
		obj.removeFirst();
		obj.removeLast();
		System.out.println("After Removing First & Last Object List is ");
		System.out.println(obj);
		obj.add(2,"jkl");
		System.out.println("Final List ");
		System.out.println(obj);
		obj.add(0,"Item");
		System.out.println("Final List ");
		System.out.println(obj);
		
		System.out.println("Traversing on List");
		for(String sc:obj)
		{ 
			System.out.println(sc);
		}
		
		System.out.println("Traversing using Iterator");
		
		Iterator itr=obj.iterator();
		while(itr.hasNext())//hasnext() return true or false if elemnts avalaible there in list
		{
			System.out.println(itr.next());//next method will return element and move to next element
		}
		

	}

}
