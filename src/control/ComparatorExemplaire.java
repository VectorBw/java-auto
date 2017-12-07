package control;

import java.util.Comparator;
import vehicule.*;

public interface ComparatorExemplaire {
	
	static final Comparator<Exemplaire> MARQUE_ORDER = new Comparator<Exemplaire>(){
		public int compare(Exemplaire ex1, Exemplaire ex2){
			String ex1Marque = ((Exemplaire)ex1).getVehicule().getMarque();
			String ex2Marque = ((Exemplaire)ex2).getVehicule().getMarque();

			return ex1Marque.compareTo(ex2Marque);
		}

	};

	static final Comparator<Exemplaire> KILOMETRE_ORDER = new Comparator<Exemplaire>(){
		public int compare(Exemplaire ex1, Exemplaire ex2){
			int ex1Kil = ex1.getKilometres();
			int ex2Kil = ex2.getKilometres();
			if(ex1Kil > ex2Kil)
				return 1;
			else if(ex1Kil < ex2Kil)
				return -1;
			else
				return 0;
		}

	};
}