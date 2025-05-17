package collections_20;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo 
{

	public static void main(String[] args) 
	{
		Vector<String> obj=new Vector<>();
		System.out.println("Initial Capacity= "+obj.capacity());
		obj.addElement("Orange");
		obj.addElement("Mango");
		obj.add("Apple");
		System.out.println("Vector Size= "+obj.size());
		obj.addElement("abc");
		obj.addElement("kbc");
		obj.addElement("bbc");
		obj.addElement("dbc");
		obj.addElement("tbc");
		obj.addElement("pqr");
		obj.addElement("xyz");
		System.out.println("New Capacity= "+obj.capacity());
		System.out.println("Vector Size= "+obj.size());
		Iterator itr=obj.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
