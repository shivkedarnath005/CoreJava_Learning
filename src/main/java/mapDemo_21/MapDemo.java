package mapDemo_21;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo 
{

	public static void main(String[] args) 
	{
		Map<Integer, String> obj=new HashMap<Integer, String>();
		obj.put(1, "Amol");
		obj.put(2, "Deokar");
		obj.put(3, "Varsha");
		obj.put(4, "Vimal");
		obj.put(5, "Ishvari");
		System.out.println(obj);
		System.out.println("Map Keys= "+obj.keySet());
		System.out.println("Map Values= "+obj.values());
		System.out.println(obj.entrySet());
		
		Set<Integer> obj1=obj.keySet();
		Iterator itr=obj1.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		for(Integer i:obj1)
		{
			System.out.println(obj.get(i));
		}
		for(Map.Entry<Integer, String> j:obj.entrySet())
		{
			System.out.println(j.getKey()+"-"+j.getValue());
			
		}
	}

}
