package hybrid.inheritance_13;

/*Hybrid Inheritance Example First level Parent Hybrid class
Level two MotherrHybrid Interface and the Father Hybrid Interface
Level Three ChildHybrid*/

public class ChildHybrid extends ParentHybrid implements MotherrHybrid, FatherHybrid 
{
	public void show() 
	{
		System.out.println("Mother and Father are parents ");
	}

	public void displayChild() 
	{
		System.out.println("Mother and Father have one child");
	}

	public static void main(String args[]) 
	{
		ChildHybrid obj = new ChildHybrid();
		System.out.println("Implementation of Hybrid Inheritance in Java");
		obj.show();
		obj.displayChild();
	}
}
