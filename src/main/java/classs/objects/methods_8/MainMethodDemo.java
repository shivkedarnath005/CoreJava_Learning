package classs.objects.methods_8;

public class MainMethodDemo
{

	public static void main(String[] args) 
	{
		MethodDemo d1=new MethodDemo();
		d1.a=20;
		System.out.println("a = "+d1.a);
		d1.hello();
		d1.add(40, 50);
		
		int c= d1.sub(50, 10);
		System.out.println("Subtraction "+c);
		System.out.println("Subtraction "+d1.sub(50, 10));
		
		
		MethodDemo d2=new MethodDemo();
		d2.a=30;
		System.out.println("a= "+d2.a);
		d2.hello();
		d2.add(20, 30);
		
	}

}

