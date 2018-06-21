package lt.baltic.talents.superhero.klounada.services;

import lt.baltic.talents.superhero.klounada.models.User;

public interface UserService {

	boolean login(User user);

	boolean create(User user);

<<<<<<< HEAD
=======
	List<User> getList();
	
	void searchByInput(String input);

>>>>>>> master
}
