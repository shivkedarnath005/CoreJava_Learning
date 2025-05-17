package setDemoExample;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo 
{

	public static void main(String[] args) 
	{
		TreeSet<Integer> obj=new TreeSet<Integer>();
		obj.add(9);
		obj.add(7);
		obj.add(5);
		obj.add(0);
		obj.add(1);
		System.out.println(obj);
		System.out.println(obj.descendingSet());
		
	}

}
