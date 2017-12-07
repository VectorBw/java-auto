package control;

import gens.Emprunteur;
import java.util.Comparator;


public interface ComparatorEmprunteur {
	/**
	 * comparateur de Emprunteur par nom
	 */
	static final Comparator<Emprunteur> NAME_ORDER = new Comparator<Emprunteur>(){
		public int compare(Emprunteur emp1, Emprunteur emp2){
			String emp1Name = ((Emprunteur)emp1).getNom();
			String emp2Name = ((Emprunteur)emp2).getNom();

			return emp1Name.compareTo(emp2Name);
		}

	};
}