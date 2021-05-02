package javaGame;

public class Main {

	public static void main(String[] args) {
		
		Campaign[] campaigns = {new SpringCampaign()};
		GameSell gameSell = new GameSell(campaigns);
		
		Gamer gamer = new Gamer();
		gamer.setTcNo(1);
		gamer.setName("Furkan");
		gameSell.sell(gamer);

	}

}
