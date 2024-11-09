package entities;

import java.util.Date;

import exceptions.MesureTypeException;

public class Achat {

	private static int increment = 0;
	private int id, produitId;
	private double quantite, prixUnitaireAchat;
	private String mesure;
	private Fournisseur fournisseur;
	private Date dateAchat, datePeremption;
	
	public Achat(int produitId, double quantite, double prixUnitaireAchat, String mesure, Fournisseur fournisseur, Date dateAchat, Date datePeremption) {
		try {
			this.id = Achat.increment;
			Achat.increment++;
			this.produitId = produitId;
			this.quantite = quantite;
			this.prixUnitaireAchat = prixUnitaireAchat;
			validateMesure(mesure);
			this.mesure = mesure;
			this.fournisseur = fournisseur;
			this.dateAchat = dateAchat;
			this.datePeremption = datePeremption;
		} catch (MesureTypeException e) {
			System.out.println("Erreur Achat : " + e);
		}
	}
	
	public int getId() {
		return id;
	}
	public int getProduitId() {
		return produitId;
	}
	public double getQuantite() {
		return quantite;
	}
	public double getPrixUnitaireAchat() {
		return prixUnitaireAchat;
	}
	public String getMesure() {
		return mesure;
	}
	public Fournisseur getFournisseur() {
		return fournisseur;
	}
	public Date getDateAchat() {
		return dateAchat;
	}
	public Date getDatePeremption() {
		return datePeremption;
	}
	
	/**Validates the measure type.
	 * 
	 * @param mesure
	 * @throws MesureTypeException if the measure type isn't compatible.
	 */
	private void validateMesure(String mesure) throws MesureTypeException {
		if(mesure != "unité" || mesure != "kg") throw new MesureTypeException("Mesure \"" + mesure + "\" du produit incompatible !");
		
	}
}
