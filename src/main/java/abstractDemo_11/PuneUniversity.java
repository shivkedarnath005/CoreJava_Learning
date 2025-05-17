package abstractDemo_11;

public abstract class PuneUniversity 
{
	public PuneUniversity()
	{
		System.out.println("Welcome to Pune University");
	}
	public void courses()
	{
		System.out.println("Pune University Provides Below Degree Courses");
		
	}
	public void feesStructure()
	{
		System.out.println("The Fees are different for each courses");
		
	}
	public abstract void idustrialVisit();
	public abstract void educationalTour();

}
