package lt.baltic.talents.superhero.klounada.services;

import java.util.List;

import lt.baltic.talents.superhero.klounada.models.User;

public interface UserService {

	boolean login();

	boolean create(User user);

<<<<<<< HEAD

=======
>>>>>>> master
	List<User> getList();
	
	List<User> getBySongName(String input);
	
	List<User> getByAuthor(String input);
	
	void searchByInput(String input);

<<<<<<< HEAD

=======
>>>>>>> master
}
