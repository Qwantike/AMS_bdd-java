package entities;

import exceptions.ProductNameLengthException;

public class Produit {
	private static int increment = 0;
	private static final int MAX_NAME_LENGTH = 15;
	private int id, numLotAchat, prixVenteActuel;
	private String nom, description, categorie;
	
	/**Constructor for a product
	 * 
	 * @param numLotAchat
	 * @param prixVenteActuel
	 * @param nom
	 * @param description
	 * @param categorie
	 */
	public Produit(int numLotAchat, int prixVenteActuel, String nom, String description, String categorie) {
		try {
			validateProductName(nom);
			this.id = Produit.increment;
			Produit.increment++;
			this.numLotAchat = numLotAchat;
			this.prixVenteActuel = prixVenteActuel;
			this.nom = nom;
			this.description = description;
			this.categorie = categorie;
		} catch(ProductNameLengthException e) {
			System.out.println("Erreur de construction : " + e.getMessage());
		}
	}

	public int getId() {
		return id;
	}

	public int getNumLotAchat() {
		return numLotAchat;
	}

	public void setNumLotAchat(int numLotAchat) {
		this.numLotAchat = numLotAchat;
	}

	public int getPrixVenteActuel() {
		return prixVenteActuel;
	}

	public void setPrixVenteActuel(int prixVenteActuel) {
		this.prixVenteActuel = prixVenteActuel;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		try {
			validateProductName(nom);
			this.nom = nom;
		} catch (ProductNameLengthException e) {
			System.out.println("Erreur de modification : " + e.getMessage());
		}
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	
	/**Verifies the name of the product entity
	 * 
	 * @param nom
	 * @throws ProductNameLengthException if the name is more than 15 characters
	 */
	private void validateProductName(String nom) throws ProductNameLengthException {
        if (nom.length() > MAX_NAME_LENGTH) {
            throw new ProductNameLengthException("Le nom du produit " + nom + " ne peut excéder " + MAX_NAME_LENGTH + " caractères.");
        }
    }
}
