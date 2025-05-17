package superKeywordDemo_17;

public class Child extends Parent
{
	//super keyword acts like parent class object reference
	String color="Yellow";
	public Child()
	{
		super();
		System.out.println("Child Constructor is Executing");
	}
	public void drink()
	{
		super.eat();
		System.out.println("Drinking");
	}
	public void show()
	{
		System.out.println("Color= "+super.color);
		System.out.println("Color= "+color);
	}

	public static void main(String[] args) 
	{
		Child c=new Child();
		c.drink();
		c.show();
	}

}
