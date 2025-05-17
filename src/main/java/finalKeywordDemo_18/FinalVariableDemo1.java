package finalKeywordDemo_18;

public class FinalVariableDemo1
{

	final String PANCARD;
	
	public FinalVariableDemo1(String pancard)
	{
		PANCARD=pancard;
		
	}
	public static void main(String[] args)
	{
		
		FinalVariableDemo1 obj1=new FinalVariableDemo1("AWIPD1507F");
		obj1.show();
		

	}
	public void show()
	{
		System.out.println("PanCard Details are "+PANCARD);
		
	}

}
