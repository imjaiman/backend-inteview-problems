package com.example.demo.objectOrientedDesign.metro;

public class MetroStationSystemTest {
	
	public static void main(String[] args) {
		
		// intializing the swipe out command
		SmartCard smcard = new SmartCard("1010","A1","weekend");
		
		SwipeInCommand swipeIn = new SwipeInCommand(smcard);
		SwipeOutCommand swipeOut = new SwipeOutCommand(smcard, 2);
		
		MetroStation metroStation = new MetroStation();
		
		metroStation.setCommand(swipeIn);
		
		try {
			metroStation.SwipeCard();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*try {
			metroStation.SwipeCard(smart);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		metroStation.setCommand(swipeOut);
		try {
			metroStation.SwipeCard();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
