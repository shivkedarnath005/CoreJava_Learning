package setDemoExample;
import java.util.HashSet;
import java.util.Iterator;

public class SetDemo1 
{

	public static void main(String[] args) 
	{
		HashSet<String> values=new HashSet<String>();  //generic set object created
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
