package hybrid.inheritance_13;

/*Hybrid Inheritance implementation ins java
 Parent is class at first level and mother and father are interfaces
 at level two and child class is at level three*/

public class HybridChild extends HybridParent implements HybriddMother,HybridFather
{

	public static void main(String[] args) 
	{
		HybridChild obj=new HybridChild();
		System.out.println("Implementation of Hybrid Inheritance in Java");
		obj.show();
		
		obj.displayChild();
		obj.div();
		obj.displayParent();
	}

	@Override
	public void show()
	{
		System.out.println("Mother & Father are Parents");
		
	}
	public void displayChild()
	{
		System.out.println("Mother & Father have one Child");
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

}
