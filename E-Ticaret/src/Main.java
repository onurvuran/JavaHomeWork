import businness.concretes.UserManager;
import core.EpostaValidation;
import dataAccess.concretes.HibernateProductDao;
import entity.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserManager usermanager = new UserManager(new HibernateProductDao(),new EpostaValidation() {
			
			
		});
		
		User user = new User();
		
		user.setAd("Furkan");
		user.setSoyadi("Ozi");
		user.setePosta("onurvuran0hotma.com");
		user.setParola("12345");
		usermanager.register(user);
		
		
		
		

	}

}
