package practice;

import java.util.ArrayList;

public class ListAdditionalElement {

	public static void main(String[] args) 
	{
		ArrayList<Integer> l1=new ArrayList<>();
		l1.add(5);
		l1.add(9);
		l1.add(2);
		l1.add(6);
		l1.add(10);
		l1.add(15);
		
		ArrayList<Integer> l2=new ArrayList<>();
		l2.add(5);
		l2.add(9);
		l2.add(2);
		l2.add(6);
		
		l1.removeAll(l2);
		System.out.println(l1);
		

	}

}
