package vehicule;

public class Vehicule {

	private String marque;
	private int numExemplaire = 0;
	private double prix = 0;
	private int id;

	public Vehicule(String marque,double prix,int id) {
		this.marque = marque;
		this.prix = prix;
		this.id=id;
	}
	public String getType(){
		return "";
	}

	
	@Override
	public String toString() {
		return " id="+id+"    "+marque ;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((marque == null) ? 0 : marque.hashCode());
		result = prime * result + numExemplaire;
		long temp;
		temp = Double.doubleToLongBits(prix);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Vehicule other = (Vehicule) obj;
		if (marque == null) {
			if (other.marque != null)
				return false;
		} else if (!marque.equals(other.marque))
			return false;
		if (numExemplaire != other.numExemplaire)
			return false;
		if (Double.doubleToLongBits(prix) != Double
				.doubleToLongBits(other.prix))
			return false;
		return true;
	}

	public int getNumExemplaire(){
		return numExemplaire;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}


	public void nouveauExemplaire(){
		numExemplaire++;
	}


	public String getMarque(){
		return this.marque;
	}
}





