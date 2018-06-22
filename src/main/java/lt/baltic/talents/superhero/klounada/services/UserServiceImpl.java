package lt.baltic.talents.superhero.klounada.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lt.baltic.talents.superhero.klounada.daos.UserDao;
import lt.baltic.talents.superhero.klounada.models.Filtras;
import lt.baltic.talents.superhero.klounada.models.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Transactional(readOnly = true)
	@Override
	public boolean login() {
		userDao.getList();
		return false;
	}

	@Transactional
	@Override
	public boolean create(User user) {
		return userDao.create(user);
	}
	
	@Transactional(readOnly = true)
	@Override
	public List<User> getList() {
		return userDao.getList();
	}

	@Transactional(readOnly = true)
	@Override
	public void searchByInput(String input) {
		userDao.getBySongName(input);
	}

	

	@Transactional(readOnly = true)
	@Override
	public List<User> getBySongName(String input) {
		return userDao.getBySongName(input);
	}
	
	@Transactional(readOnly = true)
	@Override
	public List<User> getByAuthor(String input) {
		return userDao.getByAuthor(input);

	}

}
