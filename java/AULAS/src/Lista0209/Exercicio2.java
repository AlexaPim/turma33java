package Lista0209;

import java.util.Scanner;

public class Exercicio2 {
	public static void main (String args[]) {
		//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)

		Scanner leia = new Scanner(System.in);
		int valor, x, par=0, impar=0;
		
		for (x=1; x<=10; x++) {
			System.out.println("Digite um valor: ");
			valor = leia.nextInt();
			if(valor%2==0) {
				par++;
			}
			else {
				impar++;
			}
		}
		System.out.printf("Dos n�meros informados %d s�o pares, n�meros %d s�o �mpares. ", par, impar);
	}
}
