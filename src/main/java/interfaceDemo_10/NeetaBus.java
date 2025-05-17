package interfaceDemo_10;

public class NeetaBus implements BookMyBus
{

	@Override
	public void busInformation() 
	{
		System.out.println("NeetaBus: Known for its punctuality and cleanliness. Multiple routes available.");
		
	}

	@Override
	public void ticketBooking() 
	{
		System.out.println("NeetaBus: Booking completed. Have a pleasant journey!");	
		
	}

	@Override
	public void ticketCancellation() 
	{
		System.out.println("NeetaBus: Your booking has been cancelled successfully. Refund initiated.");	
		
	}

}
