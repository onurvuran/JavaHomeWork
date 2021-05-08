package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entity.concretes.User;

public class HibernateProductDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println("Hibernate veritabanınaeklendi.");
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Hibernate Silindi.");
		
	}

	@Override
	public void update(User user) {
		System.out.println("Hibernate Güncellendi.");
		
	}

}
