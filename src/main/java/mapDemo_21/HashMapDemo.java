package mapDemo_21;

import java.util.HashMap;

public class HashMapDemo
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
		//duplicate values are not allowed in hashmap
		
		System.out.println(obj1);
		//values dont come in order in hashmap
		
		String value=obj1.get("700");
		
		System.out.println("Values from Hashmap is "+value);
		
	}

}
