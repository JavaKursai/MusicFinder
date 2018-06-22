package lt.baltic.talents.superhero.klounada.services;

import lt.baltic.talents.superhero.klounada.models.Vartotojas;

public interface VarService {
	
	boolean login(Vartotojas var);
	boolean create(Vartotojas var);

}
