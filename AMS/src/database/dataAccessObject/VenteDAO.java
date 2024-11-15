package database.dataAccessObject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.databaseInterface.ListAll;
import database.ConnectDatabase;
import entities.Vente;

public class VenteDAO implements ListAll<Vente> {

	@Override
	public List<Vente> listAll() {
		// TODO Auto-generated method stub
		
		List<Vente> listVentes = new ArrayList<>();
		
		String query = "SELECT * from Ventes";
		
		try (Connection conn = ConnectDatabase.getConnection();
				PreparedStatement stmt = conn.prepareStatement(query);
				ResultSet rs = stmt.executeQuery()) {
			
			while(rs.next()) {
				int id = rs.getInt("id");
				// etc
				// listVentes.add(new Vente(id)); compléter avec les args du produit
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectDatabase.closeConnection();
		}
		
		return listVentes;
	}

}
