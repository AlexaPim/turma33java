package Lista0209;

import java.util.Scanner;

public class Exercicio2 {
	public static void main (String args[]) {
		//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

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
		System.out.printf("Dos números informados %d são pares, números %d são ímpares. ", par, impar);
	}
}
