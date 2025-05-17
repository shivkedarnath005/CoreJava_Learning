package setDemoExample;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetToListDemo 
{

	public static void main(String[] args) 
	{
		Set<String> values=new HashSet<>();
		values.add("Selenium");
		values.add("QTP");
		values.add("Winium");
		values.add("154");
		values.add("Amol");
		values.add("Deokar");
		values.add("Java");
		
		System.out.println(values);
		
	    ArrayList<String> list=new ArrayList<>(values);
	    System.out.println(list.get(5));
		
		

	}

}
