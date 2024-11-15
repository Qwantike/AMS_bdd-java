package database.dataAccessObject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.databaseInterface.ListAll;
import database.ConnectDatabase;
import entities.Produit;

public class ProduitDAO implements ListAll<Produit> {

	@Override
	public List<Produit> listAll() {
		// TODO Auto-generated method stub
		
		List<Produit> listProduits = new ArrayList<>();
		
		String query = "SELECT * from Produits";
		
		try (Connection conn = ConnectDatabase.getConnection();
				PreparedStatement stmt = conn.prepareStatement(query);
				ResultSet rs = stmt.executeQuery()) {
			
			while(rs.next()) {
				int id = rs.getInt("id");
				// etc
				// listProduits.add(new Produit(id)); compléter avec les args du produit
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectDatabase.closeConnection();
		}
		
		return listProduits;
	}

}
