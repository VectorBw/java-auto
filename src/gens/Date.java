package gens;


import java.util.Comparator;
import java.util.GregorianCalendar;


public class Date implements Comparable<Date> {

	private int jour;
	private int mois;
	private int annee;

	public Date(int jour, int mois, int annee) throws DateException {
		if (jour > 31 || mois > 12 || mois < 0 || jour <0){
			throw new DateException("it is wrong time");
		}
		else{
			this.jour = jour;
			this.mois = mois;
			this.annee = annee;
		}
	}

	public int getJour() {
		return jour;
	}
	
	public void setJour(int jour) {
		this.jour = jour;
	}

	public int getMois() {
		return mois;
	}

	public void setMois(int mois) {
		this.mois = mois;
	}
	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}
	//affichage date devis

	@Override
	public String toString() {
		return jour + "/" + mois + "/" + annee;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + annee;
		result = prime * result + jour;
		result = prime * result + mois;
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
		Date other = (Date) obj;
		if (annee != other.annee)
			return false;
		if (jour != other.jour)
			return false;
		if (mois != other.mois)
			return false;
		return true;
	}


	public interface ComparatorDate {
		static final Comparator<Date> DATE_ORDER = new Comparator<Date>(){
			@Override
			public int compare(Date date1, Date date2) {
				if (date1.equals(date2)){
					return 0;
				}
				if (date1.annee < date2.annee){
					return -1;
				}
				else if(date1.annee == date2.annee){
					if (date1.mois < date2.mois){
						return -1;
					}
					else if (date1.mois == date2.mois){
						if (date1.jour < date2.jour){
							return -1;
						}
						else{
							return 1;
						}
					}
					else{
						return 1;
					}
				}
				else{
					return 1;
				}
			}
		};
	}


	@Override
	public int compareTo(Date date2) {
		if (this.equals(date2)){
			return 0;
		}
		if (this.annee < date2.annee){
			return -1;
		}
		else if(this.annee == date2.annee){
			if (this.mois < date2.mois){
				return -1;
			}
			else if (this.mois == date2.mois){
				if (this.jour < date2.jour){
					return -1;
				}
				else{
					return 1;
				}
			}
			else{
				return 1;
			}
		}
		else{
			return 1;
		}
	}


	public long nbJour(Date fin){
		GregorianCalendar date1 = new GregorianCalendar(this.annee,this.mois-1,this.jour,0,0,0);
		GregorianCalendar date2 = new GregorianCalendar(fin.getAnnee(),fin.getMois()-1,fin.getJour(),0,0,0);

		long aTime = date1.getTimeInMillis();
		long bTime = date2.getTimeInMillis();

		long dif = bTime - aTime;
		long res = dif/(24*60*60*1000);
		return res;
	}

}
