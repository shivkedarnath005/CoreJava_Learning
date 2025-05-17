package collections_20;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2
{

	public static void main(String[] args)
	{
		ArrayList <String> obj=new ArrayList<>();//list works on index number, generic list
		System.out.println("Size= "+obj.size());//list is shrinkabale and growable
		obj.add("Ravi");
		obj.add("Amit");
		obj.add("Mukesh");
		obj.add("Jiya");
		obj.add("Piyush");
		
		System.out.println("Size= "+obj.size());
		System.out.println(obj); //print all object content
		obj.remove(0);
		System.out.println(obj);
		obj.remove(3);
		System.out.println(obj);
		System.out.println("Size= "+obj.size());
		obj.set(1, "Rajesh"); //set list index location and content
		System.out.println(obj);
		System.out.println("Traversing on List");
		//Enhanced for loop and while loop will print all content in multiple objects in list
		
		for(String sc:obj)//enhanced for loop to access the list...use to traverse access list elements
		{ 
			System.out.println(sc);
		}
		
		System.out.println("Traversing using Iterator");
		
		Iterator itr=obj.iterator();//interface reference -iterator is array list method variable initialization
		//iterator() method will assign object to itr loop varaible
		while(itr.hasNext())//hasnext return true or false if elements avalaible there in list
		{
			System.out.println(itr.next());//next method will return element and move to next element
		}
		
	}

}
