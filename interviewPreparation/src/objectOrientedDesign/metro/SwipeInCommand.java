package objectOrientedDesign.metro;

public class SwipeInCommand implements Command {

	
	private SmartCard smartCard;
	
	public SwipeInCommand(SmartCard smartCard){
		this.smartCard=smartCard;
	}
	
	@Override
	public void execute() {
	
		try{
			 
			System.out.println("-------SWIPE IN THE CARD...  ------");
			Thread.sleep(2000);
			System.out.println("Card Balance Rs = " + smartCard.getCardbalance() + ", Start Station = " + smartCard.getStartStation() + ", DayOfYear = " + smartCard.getDay());
			Thread.sleep(2000);
		}catch(Exception e){
			System.out.println(e.getMessage());
			
		}
	}

}
