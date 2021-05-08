package dataAccess.abstracts;

import entity.concretes.User;

public interface UserDao {
	
	public void add(User user);
	public void delete(User user);
	public void update(User user);
	

}
