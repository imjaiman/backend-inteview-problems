package com.practice.backend.objectOrientedDesign.metro;

public class SmartCard {
	
	private  String ScId;
	private static int CardBalance = 20;
	private final int MIN_VALUE = 5;
	private String startStation;
	private String endStation;
	private String DayOfYear;
	
	public SmartCard(String scId, String startS, String Day){
		this.ScId = ScId;
		this.startStation = startS;
		this.DayOfYear=Day;
	}
	
	public String getStartStation() {
		return startStation;
	}
	
	public String getDay() {
		return DayOfYear;
	}
	
	public String getEndStation() {
		return endStation;
	}

	public void setEndStation(String endStation) {
		this.endStation = endStation;
	}


	public int getCardbalance() {
		return CardBalance;
	}
	
	public void calBalance(int NoOfStationsTravelled, String DayOfWeek) throws Exception{
	
		try{
			double fare = (FareMapping.fareMap.get(DayOfWeek) * NoOfStationsTravelled);
			
			System.out.println( getCardbalance() + " - " + fare + " = ");
			
			CardBalance = (int) (CardBalance - fare);
			
			if(CardBalance < MIN_VALUE){
				throw new NullPointerException("Negative Balance");
				
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
			throw e;
		}
		
		
		
	}
	

}
