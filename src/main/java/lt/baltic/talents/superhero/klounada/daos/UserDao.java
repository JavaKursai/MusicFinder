package lt.baltic.talents.superhero.klounada.daos;

import lt.baltic.talents.superhero.klounada.models.User;

public interface UserDao {
	
	boolean login(User user);
	
	boolean create(User user);

<<<<<<< HEAD
	public List<User> getList();
	
	public List<User> getByAuthor();
	
	public List<User> getBySongName(String input);
	
	
	
=======
>>>>>>> MP-versija
}
