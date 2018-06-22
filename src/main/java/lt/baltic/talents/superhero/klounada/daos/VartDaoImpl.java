package lt.baltic.talents.superhero.klounada.daos;

import java.util.List;

import javax.persistence.TypedQuery;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import lt.baltic.talents.superhero.klounada.models.Vartotojas;

@Repository
public class VartDaoImpl implements VartDao {

	@Autowired
	private VartDao vartDao;

	@Transactional(readOnly = true)
	@Override
	public boolean login(Vartotojas var) {
		return vartDao.login(var);
	}

	@Transactional
	@Override
	public boolean create(Vartotojas var) {
		return vartDao.create(var);
	}


}
