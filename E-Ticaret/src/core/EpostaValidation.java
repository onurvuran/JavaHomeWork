package core;

import entity.concretes.User;

public class EpostaValidation implements Eposta{

	@Override
	public void postaVerify(User user) {
		System.out.println("Dogrulama e-postasi gonderildi.");
		
	}
	

}
