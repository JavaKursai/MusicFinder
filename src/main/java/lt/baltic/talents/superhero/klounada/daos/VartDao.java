package lt.baltic.talents.superhero.klounada.daos;

import java.util.List;

import lt.baltic.talents.superhero.klounada.models.Vartotojas;

public interface VartDao {
	
	boolean login (Vartotojas var);
	boolean create (Vartotojas var);

}
