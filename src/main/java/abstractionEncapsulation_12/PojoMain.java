package abstractionEncapsulation_12;

public class PojoMain 
{

	public static void main(String[] args)
	{
		PojoExample ob=new PojoExample();
		ob.getI();
		ob.setI(100);
		ob.getN();
		ob.setN("Amol");
		
		System.out.println(ob.getN()+ " "+ob.getI());
	
	}

}
