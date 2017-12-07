package vehicule;

public class Exemplaire {

	private int numeroEx;
	private int kilometres;
	private Vehicule vehicule;
	private double Prix;
	private int etat = 0;

	public Exemplaire(Vehicule vehicule, int kilometres, int etat) {
		vehicule.nouveauExemplaire();
		this.vehicule =  vehicule;
		this.kilometres = kilometres;
		this.etat = etat;
		this.numeroEx = vehicule.getNumExemplaire();
		int q = this.kilometres/50000;
		double reduction = this.vehicule.getPrix()*(10*q/100);
		this.Prix =this.vehicule.getPrix()-reduction; 

	}


	@Override
	public String toString() {
		return "Exemplaire [numeroEx=" + numeroEx + ", kilometres="
				+ kilometres + ", vehicule=" + vehicule + "]";
	}

	public Vehicule getVehicule(){
		return this.vehicule;

	}
	
	public int getKilometres(){
		return this.kilometres;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(Prix);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + kilometres;
		result = prime * result + numeroEx;
		result = prime * result
				+ ((vehicule == null) ? 0 : vehicule.hashCode());
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
		Exemplaire other = (Exemplaire) obj;
		if (Double.doubleToLongBits(Prix) != Double
				.doubleToLongBits(other.Prix))
			return false;
		if (kilometres != other.kilometres)
			return false;
		if (numeroEx != other.numeroEx)
			return false;
		if (vehicule == null) {
			if (other.vehicule != null)
				return false;
		} else if (!vehicule.equals(other.vehicule))
			return false;
		return true;
	}

	public double getPrix() {
		return Prix;
	}

	public void setPrix(double prix) {
		Prix = prix;
	}

	public int getNumeroEx() {
		return numeroEx;
	}

	public void setNumeroEx(int numeroEx) {
		this.numeroEx = numeroEx;
	}

	public int getEtat() {
		return etat;
	}
	public void setEtat(int etat) {
		this.etat = etat;
	}

}
