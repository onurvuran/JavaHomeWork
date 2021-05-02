package javaGame;

public class GamerManager implements GamerEdit {

	
	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu Güncellendi."+gamer.getName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu silindi"+gamer.getName());
		
	}

	@Override
	public void register(Gamer gamer) {
		if(EdevletValidation.isValid(gamer)) {
			System.out.println("Oyuncu eklendi."+gamer.getName());
		}
		
	}
	
	
	

}
