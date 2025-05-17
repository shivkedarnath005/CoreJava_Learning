package practice;

public class BasicDemo
{
	        //Primitive Data types
			int x=567;
			long y=999;
			float z=67.45f;
			double t=30.34;
			short s=2436;
			byte b=23;
			boolean a=true;
			char o = 'c';
			
			//Non primitive Data types
			String n="Amol Deokar";
			
			public void myF()
			{
				System.out.println("Animesh");
			}
			
			public double myFunc()
			{
				int p=300;
				int q=400;
				double r=p+q;
				return r;
				
			}

	       public static void main(String[] args)
	       {
	    	   BasicDemo obj1=new BasicDemo();
	    	   System.out.println("Hello"+obj1.n+" "+obj1.s);
	    	   //object will locate and call the variable or method
	    	   obj1.myF();
	    	   System.out.println(obj1.myFunc());
		
		
	       }

}
