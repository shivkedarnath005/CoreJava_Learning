package collections_20;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo 
{

	public static void main(String[] args) 
	{
		Set<String> obj=new HashSet<String>();//no inseration order
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Banana");
		obj.add("Orange");
		obj.add("Grapes");
		obj.add(null);
		obj.add("Mango");
		obj.add(null);
		
		Iterator<String> itr=obj.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
