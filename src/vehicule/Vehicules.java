package vehicule;


import java.util.ArrayList;
import java.util.List;

public class Vehicules {
	public static List<Vehicule> vehicules=new ArrayList<Vehicule>();

	public Vehicules(){
		
		
	}

	public void add(Vehicule vehicule){
		vehicules.add(vehicule);
	}

	public void remove(Vehicule vehicule){
		vehicules.remove(vehicule);
	}
	

	@Override
	public String toString() {
		String s = "Vehicules :";
		for (Vehicule vehicule : vehicules ){
			s = s +" "+ vehicule.toString()+"\t";
		}		
		return s;
}

	public static ArrayList<Vehicule> rechercherMarque(String marque){
		ArrayList<Vehicule> results = new ArrayList<Vehicule>();
		for (Vehicule e : vehicules){
			if(e.getMarque().equals(marque)){
				results.add(e);
			}
		}
		return results;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((vehicules == null) ? 0 : vehicules.hashCode());
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
		Vehicules other = (Vehicules) obj;
		if (vehicules == null) {
			if (other.vehicules != null)
				return false;
		} else if (!vehicules.equals(other.vehicules))
			return false;
		return true;
	}
}
