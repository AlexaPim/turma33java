
package exemplo;
import java.util.Scanner;

public class Condicional {

	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite um número inteiro positivo: ");
		numero = leia.nextInt();
		
		if (numero % 2 == 1) {
			System.out.printf("O número %d é ímpar",numero);	
		}
		else if (numero == 0) {
			System.out.println("O Zero é neutro");
		}
		else if (numero < 0) {
			System.out.println("Impossível realizar!");
		}
		else {
			System.out.printf("O número %d é par.",numero);
		}
	}
}
