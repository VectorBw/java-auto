package gens;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import control.ComparatorLocation;
import vehicule.*;


public class Locations {
	private List<Location> locations;

	public Locations(){
		locations = new ArrayList<Location>();

	}

    //method add
	public void add(Location location){
		locations.add(location);
	}
    
//	method remove
	public void remove(Location location){
		locations.remove(location);
	}

//	method ajouter
	public void ajouter(Date debut, Date fin, Emprunteur emprunteur,
			boolean assurance){

		Location location = new Location(debut, fin, emprunteur, assurance);
		locations.add(location);

	}

	public List<Location> getLocations() {
		return locations;
	}

//	method date search
	public List<Location> RechercherDate(Date date){
		List<Location> results = new ArrayList<Location>();
		for (Location l : locations){
			if(l.getDebut() == date){
				results.add(l);
			}
		}
		return results;
	}

//	method exm search
	public List<Location> RechercherExemplaire(Exemplaire exemplaire){
		List<Location> results = new ArrayList<Location>();
		for (Location l : locations){
			for (Exemplaire e : l.getExemplaires()){
				if( e == exemplaire){
					results.add(l);
				}
			}
		}
		return results;
	}

//	method car search
	public List<Location> RechercherVehicule(Vehicule vehicule){
		List<Location> results = new ArrayList<Location>();
		for (Location l : locations){
			for (Exemplaire e : l.getExemplaires()){
				if( e.getVehicule() == vehicule){
					results.add(l);
				}
			}
		}
		return results;
	}

	//method search location
	public List<Location> rechercherLocEnCours() throws DateException{
		List<Location> results = new ArrayList<Location>();
		for (Location l : locations){
			if(l.DateDuJour().compareTo(l.getFin()) == 1){
				results.add(l);
			}
		}
		return results;
	}

	public void triFacture(){
		Collections.sort(locations, ComparatorLocation.FACTURE_ORDER);
	}
}
