package javaGame;

public class EdevletValidation {
	
	public static boolean isValid(Gamer gamer) {
		if(gamer.getTcNo()>0 && !gamer.getName().isEmpty() && gamer.getYearOfBirth()>1900) {
			return true;
		}else {
			return false; 
		}	
		
	}

}
