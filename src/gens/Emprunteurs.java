package gens;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import control.ComparatorEmprunteur;


public class Emprunteurs {
	public static List<Emprunteur> emprunteurs=new ArrayList<Emprunteur>();

	public Emprunteurs(){

	}

	public void add(Emprunteur emprunteur){
		emprunteurs.add(emprunteur);
	}

	public void remove(Emprunteur emprunteur){
		emprunteurs.remove(emprunteur);
	}

	public void ajouterEmprunteur(String nom, String prenom,int numero,String rue,int cP,String ville){
		Emprunteur emprunteur = new Emprunteur(nom, prenom, numero, rue, cP, ville);
		emprunteurs.add(emprunteur);
	}


	@Override
	public String toString() {
		String s = "Liste d'emprunteurs :";
		for (Emprunteur emprunteur : emprunteurs ){
			s ="\n"+ s +" "+ emprunteur.toString();
		}		
		return s;
	}

	public static ArrayList<Emprunteur> rechercherNom(String nom){
		ArrayList<Emprunteur> results = new ArrayList<Emprunteur>();
		for (Emprunteur e : emprunteurs){
			if(e.getNom().equals(nom)){
				results.add(e);
			}
		}
		return results;
	}

	public boolean trouverNom(String nom){
		for (Emprunteur e : emprunteurs){
			if(e.getNom() == nom){
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((emprunteurs == null) ? 0 : emprunteurs.hashCode());
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
		Emprunteurs other = (Emprunteurs) obj;
		if (emprunteurs == null) {
			if (other.emprunteurs != null)
				return false;
		} else if (!emprunteurs.equals(other.emprunteurs))
			return false;
		return true;
	}
	
   
    //collection
	public void triNom(){
		Collections.sort(emprunteurs, ComparatorEmprunteur.NAME_ORDER);
	}
}
