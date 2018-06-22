package lt.baltic.talents.superhero.klounada.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import lt.baltic.talents.superhero.klounada.daos.VartDao;
import lt.baltic.talents.superhero.klounada.models.Vartotojas;


@Service
public class VarServiceImpl implements VarService {

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
