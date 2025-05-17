package abstractDemo_11;

public class MITCollege extends PuneUniversity
{
	public MITCollege()
	{
		super();
	}
	
	@Override
	public void idustrialVisit() 
	{
	
	  System.out.println("MIT College provides the best Industrial Visit for Engineering students");	
		
	}

	@Override
	public void educationalTour() 
	{
		System.out.println("MIT College provides the best Educaional Tour for Non-Engineering students");
		
	}

}
