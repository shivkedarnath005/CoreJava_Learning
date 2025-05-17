package collections_20;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class SetDemo2 
{

	public static void main(String[] args) 
	{
		LinkedHashSet<String> values=new LinkedHashSet<>();
		values.add("Selenium");
		values.add("QTP");
		values.add("Winium");
		values.add("154");
		values.add("Amol");
		values.add("Deokar");
		values.add("Java");
		
		System.out.println(values);
		
		for(String e:values)
		{
			System.out.println(e);
		}
		Iterator<String> itr=values.iterator();
		while(itr.hasNext())
		{
			Object obj=itr.next();
			System.out.println("Values are = "+obj);
			
		}
		
	}

}
