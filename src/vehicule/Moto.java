package vehicule;


public class Moto extends Vehicule{
	private int cylindree;

	public Moto(String marque,double prix, int cylindree,int id) {
		super(marque,prix,id);
		this.cylindree = cylindree;
	}
	@Override
	public String getType(){
		return "moto";
	}
	public Moto(String marque,double prix, int cylindree) {
		super(marque,prix,0);
		this.cylindree = cylindree;
	}

	@Override
	public String toString() {
		return  "\n"+" Moto " +super.toString() +" "+ cylindree  ;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + cylindree;
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
		Moto other = (Moto) obj;
		if (cylindree != other.cylindree)
			return false;
		return true;
	}


}
