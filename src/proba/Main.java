package proba;

import biblioteka.Autor;
import biblioteka.Biblioteka;
import biblioteka.Knjiga;

public class Main {

	public static void main(String[] args) {
		
		Knjiga knjiga1 = new Knjiga("Naslov1", "123456789",new Autor[]{
						new Autor("Pera", "Peric"),new Autor("Mika", "Mikic")
						}
				,"Izdavac1", 1);
		Knjiga knjiga2 = new Knjiga("Naslov2", "987654321",new Autor[]{
				new Autor("Zika", "Zikic")
				}
		,"Izdavac2", 1);
		
		Biblioteka biblioteka = new Biblioteka();
		biblioteka.dodajKnjigu(knjiga1);
		biblioteka.dodajKnjigu(knjiga2);
		biblioteka.savuvajSveKnjige("knjige.json");
		
		Biblioteka novaBiblioteka = new Biblioteka();
		novaBiblioteka.ucitajSveKnjige("knjige.json");
		
		for(Knjiga k:novaBiblioteka.vratiSveKnjige()){
			System.out.println(k);
		}
		
	}

}
