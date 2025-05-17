package collections_20;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo 
{

	public static void main(String[] args) 
	{
		Set<String> obj=new LinkedHashSet<String>();
		obj.add("Cycle");
		obj.add("Bike");
		obj.add("Car");
		obj.add("Truck");
		obj.add("Bus");
		obj.add("Jeep");
		obj.add(null);
		obj.add("Bus");
		System.out.println(obj);
		
		Iterator itr=obj.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
