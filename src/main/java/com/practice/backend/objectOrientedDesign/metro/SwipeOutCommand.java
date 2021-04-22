package com.practice.backend.objectOrientedDesign.metro;

public class SwipeOutCommand implements Command{

	private SmartCard smartcard;
	private int NoOfStations;
	
	public SwipeOutCommand(SmartCard smartcard, int noOfStations){
		this.smartcard=smartcard;
		this.NoOfStations=noOfStations;
	}
	@Override
	public void execute() throws Exception {
	//System.out.println("Swipint out the card");
	try {
		System.out.println("\n\n------SWIPE OUT... ------");	
		Thread.sleep(2000);
		System.out.println("Swipe Out Station = A" + NoOfStations + ", InitialCardBalance="+smartcard.getCardbalance() + ", Day = " + smartcard.getDay());
		Thread.sleep(1000);
		System.out.println("No of Stations Travelled = " + NoOfStations + ", Fare per station = " + FareMapping.fareMap.get(smartcard.getDay()));
		Thread.sleep(1000);
		smartcard.calBalance(NoOfStations, smartcard.getDay());
		System.out.println("Card Balance left = " + smartcard.getCardbalance());	
	   
	} catch (Exception e) {
		//e.printStackTrace();
		//System.out.println("Balance Left " + smartcard.getCardbalance());
		System.out.println("Balance is insufficient, Could not go out " );
		throw e;
	}
		
	}

}
