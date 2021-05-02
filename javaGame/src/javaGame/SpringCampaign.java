package javaGame;

public class SpringCampaign implements Campaign {

	@Override
	public void delete() {
		System.out.println("Spring Kampanya Silindi");
		
	}

	@Override
	public void update() {
		System.out.println("Spring Kampanya Güncellendi");
		
	}

	@Override
	public void add() {
		System.out.println("Spring Kampanya Eklendi");
		
	}


	

}
