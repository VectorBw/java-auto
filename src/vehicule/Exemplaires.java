package vehicule;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import control.*;


public class Exemplaires {
	private List<Exemplaire> flotte;

	public Exemplaires(){
		flotte = new ArrayList<Exemplaire>();
		// charger tous les exemplaires
	}

	public void add(Exemplaire exemplaire){
		flotte.add(exemplaire);
	}


	public void remove(Exemplaire exemplaire){
		flotte.remove(exemplaire);
	}

	@Override
	public String toString() {
		String s = "Exemplaires :";
		for (Exemplaire ex : flotte ){
			s = s +" "+ ex.toString();
		}		
		return s;
	}

	public List<Exemplaire> rechercherMarque(String marque){
		List<Exemplaire> emp = new ArrayList<Exemplaire>();
		for (Exemplaire e : flotte){
			if(e.getVehicule().getMarque() == marque){
				emp.add(e);
			}
		}
		return emp;
	}

	public List<Exemplaire> rechercherKilometre(int kilometre){
		List<Exemplaire> results = new ArrayList<Exemplaire>();
		for (Exemplaire e : flotte){
			if(e.getKilometres() == kilometre){
				results.add(e);
			}
		}

		return results;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((flotte == null) ? 0 : flotte.hashCode());
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
		Exemplaires other = (Exemplaires) obj;
		if (flotte == null) {
			if (other.flotte != null)
				return false;
		} else if (!flotte.equals(other.flotte))
			return false;
		return true;
	}

	public void triMarque(){
		Collections.sort(flotte, ComparatorExemplaire.MARQUE_ORDER);
	}

	public void triKilometres(){
		Collections.sort(flotte, ComparatorExemplaire.KILOMETRE_ORDER);
	}
}

