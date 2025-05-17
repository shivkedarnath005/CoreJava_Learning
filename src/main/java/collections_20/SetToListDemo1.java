package collections_20;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class SetToListDemo1
{

	public static void main(String[] args)
	{
		LinkedHashSet<String> obj=new LinkedHashSet<>();
		obj.add("Selenium");
		obj.add("QTP");
		obj.add("Winium");
		obj.add("154");
		obj.add("Amol");
		obj.add("Deokar");
		obj.add("Java");
		System.out.println(obj);
		
		List<String> obj1=new ArrayList<String>(obj);//Set converted into List
		for(String abc:obj1)
		{
			System.out.println(abc);
		}
		

	}

}
