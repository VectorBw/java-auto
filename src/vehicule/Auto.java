package vehicule;


public class Auto extends Vehicule{
	private String modele;
	private boolean luxe = false;

	public Auto(String marque,double prix, String modele, boolean luxe,int id) {
		super(marque, prix,id);
		this.modele = modele;
		this.luxe = luxe;
	}
	public Auto(String marque,double prix, String modele, boolean luxe) {
		super(marque, prix,0);
		this.modele = modele;
		this.luxe = luxe;
	}

	@Override
	public String getType(){
		if (luxe == false){
			return "voiture standarde" ;
		}
		return "voiture luxe";
	}
	@Override
	public String toString() {
		if (luxe == false){
			return "\n"+" Voiture standarde " + super.toString()+ " " + modele ;
		}
		else{
			return  "\n"+" Voiture de luxe " + super.toString()+ " " + modele  ;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((modele == null) ? 0 : modele.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Auto other = (Auto) obj;
		if (modele == null) {
			if (other.modele != null)
				return false;
		} else if (!modele.equals(other.modele))
			return false;
		return true;
	}

}
