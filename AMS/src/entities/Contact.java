package entities;

/**Entity linked to a @Fournisseur that holds the personal human informations them.
 *
 */
public class Contact {
	private String nom, prenom, fonction, numTel, eMail;

	/**Constructor for a Contact.
	 * 
	 * @param nom
	 * @param prenom
	 * @param fonction
	 * @param numTel
	 * @param eMail
	 */
	public Contact(String nom, String prenom, String fonction, String numTel, String eMail) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.fonction = fonction;
		this.numTel = numTel;
		this.eMail = eMail;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getFonction() {
		return fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

	public String getNumTel() {
		return numTel;
	}

	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
}
