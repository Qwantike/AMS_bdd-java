package entities;

public class Fournisseur {
	private String nomSociete, numSiret, adresse, eMailPrincipal;

	public Fournisseur(String nomSociete, String numSiret, String adresse, String eMailPrincipal) {
		super();
		this.nomSociete = nomSociete;
		this.numSiret = numSiret;
		this.adresse = adresse;
		this.eMailPrincipal = eMailPrincipal;
	}

	public String getNomSociete() {
		return nomSociete;
	}

	public void setNomSociete(String nomSociete) {
		this.nomSociete = nomSociete;
	}

	public String getNumSiret() {
		return numSiret;
	}

	public void setNumSiret(String numSiret) {
		this.numSiret = numSiret;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String geteMailPrincipal() {
		return eMailPrincipal;
	}

	public void seteMailPrincipal(String eMailPrincipal) {
		this.eMailPrincipal = eMailPrincipal;
	}
}
