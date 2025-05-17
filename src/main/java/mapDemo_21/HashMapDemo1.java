package mapDemo_21;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo1
{

	public static void main(String[] args)
	{
		HashMap<String,String> obj1=new HashMap<String,String>();
		obj1.put("400", "Amol");
		obj1.put("500", "Selenium");
		obj1.put("600", "QTP");
		obj1.put("601", "Sahi");
		obj1.put("602", "Katalon");
		obj1.put("700", "Appium");
		
		for(Map.Entry<String, String> data :obj1.entrySet())
		{
			System.out.println("Key from Map is "+data.getKey() +"and Value is "+data.getValue());
		} 
		
	}

}
