package interfaceDemo_10;

public class RedBus implements BookMyBus
{

	@Override
	public void busInformation() 
	{
		System.out.println("RedBus: Provides intercity bus services with Wi-Fi and comfortable seating.");
		
	}

	@Override
	public void ticketBooking() 
	{
		System.out.println("RedBus: Booking confirmed. You will receive a confirmation email shortly.");
		
	}

	@Override
	public void ticketCancellation()
	{
		System.out.println("RedBus: Your booking has been cancelled. Refund will be processed within 5-7 business days.");
    }	
	

}
