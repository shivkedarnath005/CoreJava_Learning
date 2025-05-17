package interfaceDemo_10;

public class PurpleBus implements BookMyBus
{

	@Override
	public void busInformation() 
	{
		System.out.println("PurpleBus: Offers luxury bus services with reclining seats and onboard refreshments.");	
	}

	@Override
	public void ticketBooking() 
	{
		System.out.println("PurpleBus: Booking successful. Your seat number is 12A.");		
	}

	@Override
	public void ticketCancellation() 
	{
		System.out.println("PurpleBus: Booking cancelled. You will receive a refund soon.");	
		
	}
	
}
