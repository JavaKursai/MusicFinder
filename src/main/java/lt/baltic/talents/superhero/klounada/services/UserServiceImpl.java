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
	public boolean login(User user) {
		return userDao.login(user);
	}

	@Transactional
	@Override
	public boolean create(User user) {
		return userDao.create(user);
	}

	@Transactional
	@Override
	public void searchByInput(String input) {
		userDao.getBySongName(input);
	}

	@Override
	public List<User> getList() {
		// TODO Auto-generated method stub
		return null;
	}

}
