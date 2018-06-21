package lt.baltic.talents.superhero.klounada.daos;

import java.io.Serializable;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lt.baltic.talents.superhero.klounada.models.User;
import lt.baltic.talents.superhero.klounada.services.UserService;
import lt.baltic.talents.superhero.klounada.services.UserServiceImpl;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	private UserService userService;
	
	@Override
	public boolean create(User user) {
		Long id = (Long) sessionFactory.getCurrentSession().save(user);
		
		if (id != null) {
			return true;
		}
		
		return false;
	}

	@Override
	public boolean login(User user) {
		@SuppressWarnings("unchecked")
		TypedQuery<User> query = sessionFactory.getCurrentSession().createQuery("from User where login = ?1 and pwd = ?2");
		
		query.setParameter(1, user.getAuthor());
		query.setParameter(2, user.getSongName());
		
		List<User> users = query.getResultList();
		
		if (users != null && users.size() == 1) {
			return true;
		}
		
		return false;
	}

	
	@Override
	public List<User> getList() {
		@SuppressWarnings("unchecked")
		TypedQuery<User> query = sessionFactory.getCurrentSession().createQuery("from User order by popularity desc");
		List<User> listas = query.getResultList();
		for(User a: listas) {
			System.out.println(a.toString());
		}
		return listas;
	}
	
	@Override
	public List<User> getByAuthor() {
		@SuppressWarnings("unchecked")
		TypedQuery<User> query = sessionFactory.getCurrentSession().createQuery("from User where author = ?1 order by popularity desc");
		
		//query.setParameter(1, input);
		
		List<User> listas = query.getResultList();
		for(User a: listas) {
			System.out.println(a.toString());
		}
		return null;
	}


	
	@Override
	public List<User> getBySongName(String input) {
		@SuppressWarnings("unchecked")
		TypedQuery<User> query = sessionFactory.getCurrentSession().createQuery("from User where songName = ?1 order by popularity desc");
		
		query.setParameter(1, input);
		
		List<User> listas = query.getResultList();
		for(User a: listas) {
			System.out.println(a.toString());
		}
		return listas;
	}





	
	
}
