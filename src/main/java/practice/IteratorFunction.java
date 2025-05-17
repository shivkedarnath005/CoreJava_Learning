package practice;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorFunction {

	public static void main(String[] args) 
	{
		ArrayList<String> studentList=new ArrayList<>();

        Iterator<String> itr=studentList.iterator();
        
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        }
	}

}
