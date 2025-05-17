package collections_20;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo 
{

	public static void main(String[] args) 
	{
		Set<String> obj=new LinkedHashSet<>();
		obj.add("Rohan");
		obj.add("Ravi");
		obj.add("Amol");
		obj.add("Varsha");
		obj.add("Vipul");
		obj.add("Ishvari");
		obj.add("Amit");
		System.out.println(obj);
		obj.remove("Ravi");
		System.out.println("Linked Hash Set Size= "+obj.size());
		System.out.println(obj);
		
	
	}

}
