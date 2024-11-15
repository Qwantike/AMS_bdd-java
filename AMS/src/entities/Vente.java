package entities;

import java.util.Date;

public class Vente {
	@Override
	public String toString() {
		return "Vente [id=" + id + ", idProduit=" + idProduit + ", prixDuMoment=" + prixDuMoment + ", dateAchat="
				+ dateAchat + "]";
	}

	private static int increment = 0;
	private int id, idProduit, prixDuMoment;
	private Date dateAchat;
	
	public Vente(int idProduit, int prixDuMoment, Date dateAchat) {
		super();
		this.id = Vente.increment;
		Vente.increment++;
		this.idProduit = idProduit;
		this.prixDuMoment = prixDuMoment;
		this.dateAchat = dateAchat;
	}

	public int getId() {
		return id;
	}

	public int getIdProduit() {
		return idProduit;
	}

	public int getPrixDuMoment() {
		return prixDuMoment;
	}

	public Date getDateAchat() {
		return dateAchat;
	}
}
