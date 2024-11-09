package entities;

import java.util.Date;

public class Contrat {
	private static int increment = 0;
	
	private int id, fournisseurId, quantiteMin;
	private Date dateDebut, dateFin;
	private double prixFixe;
	public Contrat(int fournisseurId, int quantiteMin, Date dateDebut, Date dateFin, double prixFixe) {
		this.id = Contrat.increment;
		Contrat.increment++;
		this.fournisseurId = fournisseurId;
		this.quantiteMin = quantiteMin;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.prixFixe = prixFixe;
	}
	public int getId() {
		return id;
	}
	public int getFournisseurId() {
		return fournisseurId;
	}
	public int getQuantiteMin() {
		return quantiteMin;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public double getPrixFixe() {
		return prixFixe;
	}
}
