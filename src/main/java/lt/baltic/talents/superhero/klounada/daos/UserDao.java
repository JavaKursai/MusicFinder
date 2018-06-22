package lt.baltic.talents.superhero.klounada.daos;

import java.util.List;

import lt.baltic.talents.superhero.klounada.models.User;

public interface UserDao {
	
	boolean login(User user);
	
	boolean create(User user);


	public List<User> getList();
	
	public List<User> getByAuthor(String input);
	
	public List<User> getBySongName(String input);
	

}
	

