package gens;

import vehicule.Exemplaire;

public class Emprunteur {



	//id unique avec autoincrementation
	private static int id = 1;
	private int idPerso;
	private String nom;
	private String prenom;
	private Adresse adresse;


	public Emprunteur(String nom, String prenom,int numero,String rue,int cP,String ville) {
		this.idPerso=id;
		this.id++;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = new Adresse(numero,rue,cP,ville);
	}

	public void louer(Exemplaire ex){


	}

	public void ramener(Exemplaire ex){

	}

	@Override
	public String toString() {
		return "\n"+"Emprunteur [id=" + idPerso + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse.toString() + "]";
	}

	public static int getId() {
		return id-1;
	}
	public int getIdPerso() {
		return idPerso;
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

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adresse == null) ? 0 : adresse.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emprunteur other = (Emprunteur) obj;
		if (adresse == null) {
			if (other.adresse != null)
				return false;
		} else if (!adresse.equals(other.adresse))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		return true;
	}
}
