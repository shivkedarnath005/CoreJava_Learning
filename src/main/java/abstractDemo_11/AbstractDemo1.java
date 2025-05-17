package abstractDemo_11;

public class AbstractDemo1 extends AbstractDemo
{

	public static void main(String[] args) 
	{
		AbstractDemo1 d=new AbstractDemo1();
		d.get();
		System.out.println(d.a);
		d.show();	
	}

	@Override
	public void show() 
	{
	   System.out.println("This is a show method");		
	}

}
