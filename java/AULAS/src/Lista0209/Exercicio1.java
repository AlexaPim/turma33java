package Lista0209;

public class Exercicio1 {

	public static void main(String[] args) {
		// Informar todos os números de 1000 a 1999 que quando divididos por 
		//11 obtemos resto = 5. (FOR)
		int numero;
		
		System.out.println("Números que divididos por 11 resulta em 5: ");
		for(numero=1000; numero<2000; numero++) {
			if ((numero%11)==5) {
				System.out.printf("\n%d",numero);
			}
		}
	}

}
