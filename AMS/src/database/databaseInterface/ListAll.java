package database.databaseInterface;

import java.util.List;

public interface ListAll<U> {
	
	/**
	 * Permet de créer une Liste d'un objet U en récupérant ses instances dans la base de données (Postgresql).
	 */
	public List<U> listAll();
}
