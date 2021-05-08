package businness.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;



import businness.abstracts.UserService;
import core.Eposta;
import dataAccess.abstracts.UserDao;
import entity.concretes.User;

public class UserManager implements UserService {
	private UserDao userDao;
	private Eposta eposta;

	public UserManager(UserDao userDao,Eposta eposta) {
		super();
		this.userDao = userDao;
		this.eposta = eposta;
	}

	private List<String> eMailList = new ArrayList<String>();
	
	


		
	

	@Override
	public void register(User user) {
		
		
		Pattern regex = Pattern.compile(
				"[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?",
				Pattern.CASE_INSENSITIVE);
		Matcher m = regex.matcher(user.getParola());
		 boolean b = m.matches();
		
		
		
		

		if (eMailList.contains(user.getePosta())) {
			System.out.println("Bu E-Mail Adresi Kullanılıyor");
			return;
		}
		if (user.getParola().length() > 5) {
			System.out.println("parola en az 5 karakterden uzun  olmali");
			return;
		}
		if (user.getAd().length() < 2 || (user.getSoyadi().length() < 2)) {
			System.out.println("isim ve soyisim en az 2 karakterden uzun olmali");
			return;
		}
		
		
		
		
		
		
		else {
			System.out.println("Dogrulama gerceklesti Kayit islemi tammalandi: "+ user.getAd());
			this.eposta.postaVerify(user);
			this.userDao.add(user);
		}
		
		
		

	}
}
