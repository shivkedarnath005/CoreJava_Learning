package conditionalStatement_6;

public class Nesteddemo2 {

	public static void main(String[] args)
	{
		int a,b,c;
		a=40; b=20; c=10;
		if((a>b)&&(a>c))
		{
			
			System.out.println("a is greater");
			
		}
		else
		{
			if(b>c)
			{
				System.out.println("b is greater");
			}
			else
			{
				System.out.println("c is greater");
			}
		}
		
	}

}
