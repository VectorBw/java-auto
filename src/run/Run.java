package run;

import vehicule.*;
import gens.*;



public class Run {

	public static void main(String[] args) throws DateException {
		System.out.println("######## TESTS DES Adresse ########");
		Run.testAdresse();
		System.out.println("######## TESTS DES Auto ########");
		Run.testAuto();
		System.out.println("######## TESTS DES Moto ########");
		Run.testMoto();
		System.out.println("######## TESTS DES Emprunteur ########");
		Run.testEmprunteur();
		System.out.println("######## TESTS DES Exemplaire ########");
		Run.testExemplaire();
		System.out.println("######## TESTS DES Exemplaire ########");
		Run.testDate();
		System.out.println("######## TESTS DES location########");
		Run.testlocation();
	}



	private static void testAdresse() {
		Adresse adresse1 = new Adresse(4,"AV RUE",94800,"Villejuif");
		Adresse adresse2 = new Adresse(5,"LA RUE",72456,"paris");
		System.out.println(adresse1.toString());
		System.out.println(adresse2.toString());
		
	}
	private static void testAuto() {
		Auto auto1 = new Auto("FERRARI",500,"Testarossa ",true,1);
		Auto auto2 = new Auto("FERRARI",500,"Testarossa ",true,2);
		Auto auto3 = new Auto("FERRARI",500,"Testarossa ",true,3);
		
		Auto auto4 = new Auto("MAZDA",100,"MX5 ",false,1);
		Auto auto5 = new Auto("TOYOTA",200,"YARIS ",false,2);
		Auto auto6 = new Auto("TOYOTA",200,"YARIS ",false,3);
		System.out.println(auto1.toString());
		System.out.println(auto2.toString());
		System.out.println(auto3.toString());
		System.out.println(auto4.toString());
		System.out.println(auto5.toString());
		System.out.println(auto6.toString());
		
	}
	private static void testMoto() {
		Moto moto1 = new Moto("HONDA",888, 8,1);
		Moto moto2 = new Moto("HONDA",888, 8,2);
		Moto moto3 = new Moto("HONDA",888, 8,3);
		Moto moto4 = new Moto("KAWAZAKI",999, 9,4);
		Moto moto5 = new Moto("KAWAZAKI",999, 9,5);
		System.out.println(moto1.toString());
		System.out.println(moto2.toString());
		System.out.println(moto3.toString());
		System.out.println(moto4.toString());
		System.out.println(moto5.toString());
		
	}
	private static void testEmprunteur() {
		Emprunteur emprunteur1 = new Emprunteur("Wang", "Yu", 4,"AV RUE",94800,"Villejuif");
		Emprunteur emprunteur2 = new Emprunteur("Liu", "Qitao", 5,"LA RUE",72456,"paris");
		Emprunteur emprunteur3 = new Emprunteur("Wang", "tao", 6,"AV sd RUE",94800,"Villejuif");
		System.out.println(emprunteur1.toString());
		System.out.println(emprunteur2.toString());
		System.out.println(emprunteur3.toString());
		
		Emprunteurs empsTest = new Emprunteurs();
		empsTest.add(emprunteur1);
		empsTest.add(emprunteur2);
		empsTest.add(emprunteur3);
		System.out.println(empsTest);
		
		String s = "rechercher nom";
		for(Emprunteur e : Emprunteurs.rechercherNom("Wang")){			
					s = s + " " + e.toString();
				}
		System.out.println(s);
		System.out.println("Test tri");
		empsTest.triNom();
		System.out.println(empsTest);
		
	}
	private static void testExemplaire() {
		Auto auto1 = new Auto("FERRARI",500,"Testarossa ",true,1);
		Auto auto2 = new Auto("FERRARI",500,"Testarossa ",true,2);
		Auto auto3 = new Auto("FERRARI",500,"Testarossa ",true,3);
		Auto auto4 = new Auto("MAZDA",100,"MX5 ",false,1);
		Auto auto5 = new Auto("TOYOTA",200,"YARIS ",false,2);
		Auto auto6 = new Auto("TOYOTA",200,"YARIS ",false,3);
		Exemplaire exemplaire1 = new Exemplaire(auto1,10000,1);
		Exemplaire exemplaire2 = new Exemplaire(auto2,20000,1);
		Exemplaire exemplaire3 = new Exemplaire(auto3,30000,1);
		Exemplaire exemplaire4 = new Exemplaire(auto4,10000,1);
		Exemplaire exemplaire5 = new Exemplaire(auto5,20000,1);
		Exemplaire exemplaire6 = new Exemplaire(auto6,30000,1);
		
		Exemplaires exs = new Exemplaires();
		exs.add(exemplaire1);
		exs.add(exemplaire2);
		exs.add(exemplaire3);
		exs.add(exemplaire4);
		exs.add(exemplaire5);
		exs.add(exemplaire6);
		
		String s = "rechercher kilo:";
		for(Exemplaire e : exs.rechercherKilometre(20000)){			
					s = s + " " + e.toString();
				}
		System.out.println(s);
		s = "rechercher marque:";
		for(Exemplaire e : exs.rechercherMarque("TOYOTA")){			
					s = s + " " + e.toString();
				}
		System.out.println(s);
		
		Vehicules vehs = new Vehicules();
		vehs.add(auto1);
		vehs.add(auto2);
		vehs.add(auto3);
		vehs.add(auto4);
		vehs.add(auto5);
		s = "rechercher marque:";
		for(Vehicule e : vehs.rechercherMarque("TOYOTA")){			
					s = s + " " + e.toString();
				}
		System.out.println(s);
		}

		
	
	private static void testDate() {
		try{
			Date date1 = new Date(01,11,2016);
			Date date2 = new Date(01,11,2016);
			Date date3 = new Date(30,11,2016);
			Date date4 = new Date(01,11,2016);
			Date date5 = new Date(01,12,2016);

			System.out.println(date1.toString());
			System.out.println(date2.toString());
			System.out.println(date3.toString());

			System.out.println("Nb jour : ");
			System.out.println(date4.nbJour(date5));
		}
		catch(DateException e){
			System.out.println(e.getMessage());
		}
	}
	
	private static void testlocation() throws DateException {
		Emprunteur emprunteur1 = new Emprunteur("Wang", "Yu", 4,"AV RUE",94800,"Villejuif");
		Emprunteur emprunteur2 = new Emprunteur("Liu", "Qitao", 5,"LA RUE",72456,"paris");
		Emprunteur emprunteur3 = new Emprunteur("Wang", "tao", 6,"AV sd RUE",94800,"Villejuif");
		
		Date date1 = new Date(01,11,2016);
		Date date2 = new Date(01,11,2016);
		Date date3 = new Date(30,11,2016);
		Date date4 = new Date(21,11,2016);
		Date date5 = new Date(01,12,2016);

		Location loca1 = new Location(date1,date3,emprunteur1,true);
		Location loca2 = new Location(date2,date3,emprunteur2,true);
		Location loca3 = new Location(date4,date5,emprunteur3,true);
		
		Locations locas = new Locations();
		locas.add(loca1);
		locas.add(loca2);
		locas.add(loca3);
		
		Auto auto1 = new Auto("FERRARI",500,"Testarossa ",true,1);
		Auto auto2 = new Auto("FERRARI",500,"Testarossa ",true,2);
		Auto auto3 = new Auto("FERRARI",500,"Testarossa ",true,3);
		Auto auto4 = new Auto("MAZDA",100,"MX5 ",false,1);
		Auto auto5 = new Auto("TOYOTA",200,"YARIS ",false,2);
		Auto auto6 = new Auto("TOYOTA",200,"YARIS ",false,3);
		Exemplaire exemplaire1 = new Exemplaire(auto1,10000,1);
		Exemplaire exemplaire2 = new Exemplaire(auto2,20000,1);
		Exemplaire exemplaire3 = new Exemplaire(auto3,30000,1);
		Exemplaire exemplaire4 = new Exemplaire(auto4,10000,1);
		Exemplaire exemplaire5 = new Exemplaire(auto5,20000,1);
		Exemplaire exemplaire6 = new Exemplaire(auto6,30000,1);
		
		loca1.getExemplaires().add(exemplaire1);
		loca1.getExemplaires().add(exemplaire2);
		loca1.getExemplaires().add(exemplaire3);
		loca1.getExemplaires().add(exemplaire4);
		loca1.getExemplaires().add(exemplaire5);
		loca1.getExemplaires().add(exemplaire6);
		
		
	
		System.out.println(loca1.prixTotal());
		
	}
		
	

}
