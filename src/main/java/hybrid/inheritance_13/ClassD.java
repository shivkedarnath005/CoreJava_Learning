package hybrid.inheritance_13;
//Hybrid inheritance
//Parent Class - ClassA  Siblings - ClassB, ClassC and Child class ClassD

public class ClassD extends ClassB implements ClassC
{

	public static void main(String[] args) 
	{
		ClassD obj=new ClassD();
		obj.show();
		
	}
	public void show()
	{
		System.out.println("Show the Method");
	}

}
