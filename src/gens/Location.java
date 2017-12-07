package gens;


import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import vehicule.*;

public class Location {

	private static int numeroLoc = 0;
	private Date debut;
	private Date fin;
	private Emprunteur emprunteur;
	private List <Exemplaire> exemplaires;
	private boolean assurance;


	private final int PRIX_REMISE_ETAT = 500;
	private final int PRIX_ASSURANCE_JOUR = 10;
	private final int PRIX_CARBURANT = 5;
	private final int PRIX_PENALITE = 10;


	public Location(Date debut, Date fin, Emprunteur emprunteur,
			boolean assurance) {
		super();
		numeroLoc++;
		this.debut = debut;
		this.fin = fin;
		this.emprunteur = emprunteur;
		this.exemplaires = new ArrayList<Exemplaire>();
		this.assurance = assurance;


	}

	public Emprunteur getEmprunteur() {
		return emprunteur;
	}

	public int getNumeroLoc() {
		return numeroLoc;
	}

	
	public Date getDebut() {
		return debut;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((debut == null) ? 0 : debut.hashCode());
		result = prime * result
				+ ((emprunteur == null) ? 0 : emprunteur.hashCode());
		result = prime * result
				+ ((exemplaires == null) ? 0 : exemplaires.hashCode());
		result = prime * result + ((fin == null) ? 0 : fin.hashCode());
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
		Location other = (Location) obj;
		if (debut == null) {
			if (other.debut != null)
				return false;
		} else if (!debut.equals(other.debut))
			return false;
		if (emprunteur == null) {
			if (other.emprunteur != null)
				return false;
		} else if (!emprunteur.equals(other.emprunteur))
			return false;
		if (exemplaires == null) {
			if (other.exemplaires != null)
				return false;
		} else if (!exemplaires.equals(other.exemplaires))
			return false;
		if (fin == null) {
			if (other.fin != null)
				return false;
		} else if (!fin.equals(other.fin))
			return false;
		return true;
	}


	public List<Exemplaire> getExemplaires() {
		return exemplaires;
	}


	public boolean isAssurance() {
		return assurance;
	}

	
	public void setAssurance(boolean assurance) {
		this.assurance = assurance;
	}

	public Date getFin() {
		return fin;
	}

	//method  prix 
	public double calculPrix(){
		double somme = 0;
		for (Exemplaire e : exemplaires){
			somme = somme + e.getPrix();
		}
		double res;
		if (this.assurance == true){
			res = this.debut.nbJour(this.fin)*(somme+PRIX_ASSURANCE_JOUR*this.exemplaires.size());
		}
		else{
			res = this.debut.nbJour(this.fin)*(somme);
		}
		return res;

	}

	// method prix jour
	public double calculPrixJour(){
		double somme = 0;
		for (Exemplaire e : exemplaires){
			somme = somme + e.getPrix();
		}
		double res;
		if (this.assurance == true){
			res = (somme+PRIX_ASSURANCE_JOUR*this.exemplaires.size());
		}
		else{
			res = somme;
		}
		return res;

	}
	
	//method date
	public Date DateDuJour() throws DateException{
		GregorianCalendar date = new GregorianCalendar();
		int jour = date.get(GregorianCalendar.DAY_OF_MONTH);
		int mois =  date.get(GregorianCalendar.MONTH)+1;
		int annee = date.get(GregorianCalendar.YEAR);

		Date dateJour = new Date(jour,mois,annee);

		return dateJour;
	}
	
	public int prixEtat(){
		int sommeEtat = 0; 
		sommeEtat = 4 * PRIX_REMISE_ETAT;	
		return sommeEtat;
	}

	public int prixCarburant(){
		int sommeCarburant = 0;
		int valeurTemporaireFixe = 3;
		for (Exemplaire e : this.exemplaires){
			sommeCarburant = sommeCarburant + 4 - valeurTemporaireFixe;

		}
		return sommeCarburant * PRIX_CARBURANT;
	}

	public int getPRIX_REMISE_ETAT() {
		return PRIX_REMISE_ETAT;
	}

	public int getPRIX_ASSURANCE_JOUR() {
		return PRIX_ASSURANCE_JOUR;
	}

	public int getPRIX_CARBURANT() {
		return PRIX_CARBURANT;
	}
	
	public int getPRIX_PENALITE() {
		return PRIX_PENALITE;
	}
	

	public double prixTotal() throws DateException{
		double prix;
		int fraiEtat = 0;
		if (this.assurance == false){
			fraiEtat = prixEtat();
		}
		if (this.DateDuJour().compareTo(this.getFin()) == 1){
			prix = this.calculPrix() + fraiEtat + this.prixCarburant() 
			+ this.getPRIX_PENALITE()*this.getFin().nbJour(this.DateDuJour())*this.getExemplaires().size()
			+ this.getFin().nbJour(this.DateDuJour())*this.calculPrixJour();
		}
		else{
			prix = this.calculPrix() + fraiEtat + this.prixCarburant();
		}
		return prix;
	}
}
