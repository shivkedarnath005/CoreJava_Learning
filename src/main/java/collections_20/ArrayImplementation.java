package collections_20;
//StudentData class objects implemented in this class

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayImplementation
{

	public static void main(String[] args) 
	{
		StudentData st1=new StudentData();
		st1.setId(1);
		st1.setName("Sumit");
		st1.setAge(18);
		
		StudentData st2=new StudentData();
		st2.setId(2);
		st2.setName("Amol");
		st2.setAge(35);
		
		StudentData st3=new StudentData();
		st3.setId(3);
		st3.setName("Ishvari");
		st3.setAge(8);
		
		StudentData st4=new StudentData();
		st4.setId(4);
		st4.setName("Varsha");
		st4.setAge(30);
		
		ArrayList<StudentData> stu=new ArrayList<>();//generic array list of multiple objects
		stu.add(st1);
		stu.add(st2);
		stu.add(st3);
		stu.add(st4);
		
		Iterator itr=stu.iterator(); //initialize the loop variable itr to object assignment to refernce
		while(itr.hasNext())//check true or false 
		{
			//Students data=(Studentdata)itr.next();
			//System.out.println(s.getId+" "+getName()+s.get);
			System.out.println(itr.next());
		}
		
		
	}

}
