package control;

import gens.DateException;
import gens.Location;
import java.util.Comparator;

public interface ComparatorLocation {

	static final Comparator<Location> FACTURE_ORDER = new Comparator<Location>(){
		public int compare(Location lo1, Location lo2){

			double lo1Prix = 0;
			double lo2Prix = 0;
			try {
				lo1Prix = lo1.prixTotal();
				lo2Prix = lo2.prixTotal();
			} catch (DateException e) {
				e.printStackTrace();
			}

			if(lo1Prix > lo2Prix)
				return 1;
			else if(lo1Prix < lo2Prix)
				return -1;
			else
				return 0;
		}	
	};
}
