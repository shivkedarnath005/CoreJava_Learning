package staticKeyword_18;

public class OuterMain 
{

	public static void main(String[] args) 
	{
		/*Outer out=new Outer();
		Outer.Inner in=out.new Inner();
		in.getMsg();*/
		
		//static class call
		Outer.Inner in=new Outer.Inner();
		in.getMsg();
		
		//static method call
		
		Outer.Inner.getMsg();
	
	}

}
