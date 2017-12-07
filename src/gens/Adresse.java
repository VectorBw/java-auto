package gens;

public class Adresse {


	private int numero;
	private String rue;
	private int cP;
	private String ville;

	public Adresse(int numero, String rue, int cP, String ville) {
		this.numero = numero;
		this.rue = rue;
		this.cP = cP;
		this.ville = ville;
	}

	@Override
	public String toString() {
		return "Adresse : " + numero  +" "+ rue + " " + cP +" "+  ville ;
	}
	
	//setteur et getteur
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public int getCP() {
		return cP;
	}

	public void setCP(int cP) {
		this.cP = cP;
	}
	

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cP;
		result = prime * result + numero;
		result = prime * result + ((rue == null) ? 0 : rue.hashCode());
		result = prime * result + ((ville == null) ? 0 : ville.hashCode());
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
		Adresse other = (Adresse) obj;
		if (cP != other.cP)
			return false;
		if (numero != other.numero)
			return false;
		if (rue == null) {
			if (other.rue != null)
				return false;
		} else if (!rue.equals(other.rue))
			return false;
		if (ville == null) {
			if (other.ville != null)
				return false;
		} else if (!ville.equals(other.ville))
			return false;
		return true;
	}

	
}
