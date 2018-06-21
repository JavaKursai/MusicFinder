package lt.baltic.talents.superhero.klounada.services;

import java.util.List;

import lt.baltic.talents.superhero.klounada.models.User;

public interface UserService {

	boolean login(User user);

	boolean create(User user);


	List<User> getList();
	
	void searchByInput(String input);


}
