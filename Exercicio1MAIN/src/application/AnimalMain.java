package application;

import entities.Cachorro;
import entities.Cavalo;
import entities.Preguica;

public class AnimalMain {

	public static void main(String[] args) {
		Cachorro dog1 = new Cachorro("Flora", 13, true, "corre", "salsicha");
		Cachorro dog2 = new Cachorro("Lola", 5, true, "corre", "pug");
		Cavalo cav1 = new Cavalo("Billy", 3, true, "trota", "preto");
		Preguica pre1 = new Preguica("Meg", 3, false, "dorme", "pelo longo");
		
		
		dog1.infoCachorro();
		System.out.println();
		dog2.infoCachorro();
		System.out.println();
		cav1.infoCavalo();
		System.out.println();
		pre1.infoPreguica();

	}

}
