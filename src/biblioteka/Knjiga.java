package biblioteka;

import java.util.Arrays;

public class Knjiga {
	
	private String naslov;
	private String isbn;
	private Autor[] autori;
	private String izdavac;
	private int izdanje;
	
	public Knjiga() {
		
	}
	
	public Knjiga(String naslov, String isbn, Autor[] autori, String izdavac, int izdanje) {
		this.setNaslov(naslov);
		this.setIsbn(isbn);
		this.setAutori(autori);
		this.setIzdavac(izdavac);
		this.setIzdanje(izdanje);
	}

	public String getNaslov() {
		return naslov;
	}
	
	public void setNaslov(String naslov) {
		if (naslov == null || naslov.isEmpty())
			throw new RuntimeException("Naslov knjige ne sme biti null niti prazan String");
		
		this.naslov = naslov;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		if (isbn == null || isbn.isEmpty() || (isbn.length() != 13 && isbn.length()!=9))
			throw new RuntimeException("ISBN ne sme biti null i mora biti duzine 9 ili 13");
		
		this.isbn = isbn;
	}
	
	public Autor[] getAutori() {
		return autori;
	}
	
	public void setAutori(Autor[] autori) {
		if (autori == null)
			throw new RuntimeException("Autori ne smeju biti null");
		
		this.autori = autori;
	}
	
	public String getIzdavac() {
		return izdavac;
	}
	
	public void setIzdavac(String izdavac) {
		if (izdavac == null || izdavac.isEmpty())
			throw new RuntimeException("Izdavac ne sme biti null niti prazan String");

		this.izdavac = izdavac;
	}
	
	public int getIzdanje() {
		return izdanje;
	}
	
	public void setIzdanje(int izdanje) {
		if (izdanje < 1)
			throw new RuntimeException("Izdanje mora biti 1 ili vece");

		this.izdanje = izdanje;
	}

	@Override
	public String toString() {
		return "Knjiga [naslov=" + naslov + ", isbn=" + isbn + ", autori=" + Arrays.toString(autori) + ", izdavac="
				+ izdavac + ", izdanje=" + izdanje + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
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
		Knjiga other = (Knjiga) obj;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		return true;
	}
	
}
