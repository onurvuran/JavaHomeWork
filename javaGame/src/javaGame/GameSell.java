package javaGame;
public class GameSell  {
	 private Campaign[] campaign;
	 
	 
	public GameSell(Campaign[] campaign) {
		this.campaign = campaign;
	}
	
	


	public void sell(Gamer gamer) {
		System.out.println(gamer.getName()+"  Satis yapildi.");
		

		Utils.buy(campaign,gamer.getName());
		
		
	}
	

}
