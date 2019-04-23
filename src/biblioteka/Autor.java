package biblioteka;

/**
 * Klasa koja predstavlja autora knjige.
 * 
 * @author Bojan Tomic
 * @version 1.0
 *
 */
public class Autor {
	
	/**
	 * Ime autora kao String.
	 */
	private String ime;
	
	
	/**
	 * Prezime autora kao String.
	 */
	private String prezime;
	
	/**
	 * Inicijalizuje autora.
	 * 
	 */
	public Autor() {
	}
	
	/**
	 * Inicijalizuje autora i postavlja ime i prezime na unete vrednosti pozivanjem set metoda.
	 * 
	 * @param ime ime autora
	 * @param prezime prezime autora
	 */
	public Autor(String ime, String prezime) {
		this.setIme(ime);
		this.setPrezime(prezime);
	}

	/**
	 * Metoda koja vraca ime autora.
	 * @return ime kao String
	 */
	public String getIme() {
		return ime;
	}
	
	/**
	 * Metoda postavlja novo ime autora.
	 * 
	 * @param ime nova vrednost za ime
	 * @throws java.lang.RuntimeException ako je uneto ime null ili
	 * prazan String
	 */
	public void setIme(String ime) {
		if (ime == null || ime.isEmpty())
			throw new RuntimeException("Ime ne sme biti null niti prazan String");
		
		this.ime = ime;
	}
	
	/**
	 * Metoda koja vraca prezime autora.
	 * @return prezime kao String
	 */
	public String getPrezime() {
		return prezime;
	}
	
	/**
	 * Metoda postavlja novo prezime autora.
	 * 
	 * @param prezime nova vrednost za prezime
	 * @throws java.lang.RuntimeException ako je uneto prezime null ili
	 * prazan String
	 */
	public void setPrezime(String prezime) {
		if (prezime == null || prezime.isEmpty())
			throw new RuntimeException("Prezime ne sme biti null niti prazan String");
		
		this.prezime = prezime;
	}

	@Override
	public String toString() {
		return "Autor [ime=" + ime + ", prezime=" + prezime + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ime == null) ? 0 : ime.hashCode());
		result = prime * result + ((prezime == null) ? 0 : prezime.hashCode());
		return result;
	}

	/**
	 * Poredi dva autora po imenu i prezimenu.
	 * 
	 * @return true ako su i ime i prezime oba autora isti, false ako
	 * to nije slucaj.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autor other = (Autor) obj;
		if (ime == null) {
			if (other.ime != null)
				return false;
		} else if (!ime.equals(other.ime))
			return false;
		if (prezime == null) {
			if (other.prezime != null)
				return false;
		} else if (!prezime.equals(other.prezime))
			return false;
		return true;
	}

}
