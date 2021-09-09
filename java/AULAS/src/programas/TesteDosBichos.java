package programas;

import classes.Cachorro;
import classes.Cavalo;
import classes.Preguica;

public class TesteDosBichos {

	public static void main(String[] args) {
		
		Cachorro dog1 = new Cachorro("Caramelo",5);
		Cavalo panga1 = new Cavalo("Pé-de-pano",8);
		Preguica bicho1 = new Preguica("Flash", 6);
		
		dog1.correr();
		panga1.correr();
		bicho1.subirArvore();
		System.out.println("\n");
		
		System.out.println(panga1.toString());
		panga1.emitirSom();
		System.out.println(dog1.toString());
		dog1.emitirSom();
		System.out.println(bicho1.toString());
		
		
		

	}

}
