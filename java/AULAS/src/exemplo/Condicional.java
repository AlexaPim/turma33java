
package exemplo;
import java.util.Scanner;

public class Condicional {

	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite um n�mero inteiro positivo: ");
		numero = leia.nextInt();
		
		if (numero % 2 == 1) {
			System.out.printf("O n�mero %d � �mpar",numero);	
		}
		else if (numero == 0) {
			System.out.println("O Zero � neutro");
		}
		else if (numero < 0) {
			System.out.println("Imposs�vel realizar!");
		}
		else {
			System.out.printf("O n�mero %d � par.",numero);
		}
	}
}
