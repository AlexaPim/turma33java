package Lista0209;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero=0, contador=0;
		double media=0.00, total = 0;
		
		do {
			System.out.print("Digite um n�mero: ");
			numero = leia.nextInt();
			if (numero>0 && (numero%3)==0) {
				contador++;
				total+=numero;
			}
			
		} while(numero > 0);
			if(contador>0) {
				media = total / contador;
			}		
		System.out.printf("Soma dos n�meros: %.0f, total de n�meros digitados que s�o m�ltiplos de 3: %d \ne a m�dia deles � igual a: %.2f.",total, contador,media);

	}

}
