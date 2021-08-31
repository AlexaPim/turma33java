import java.util.Scanner;

	public class CelsiusFahren {
		
		public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		double graus_celsius, graus_fahrenheit;
		
		
		System.out.print("Digite o nome: ");
		nome = leia.next().toUpperCase();
		System.out.print("Digite a temperatura em Celsius: ");
		graus_celsius = leia.nextDouble();
	
		graus_fahrenheit = 1.8 * graus_celsius + 32;
		
		
		System.out.println("Sua temperatura convertida é: " +graus_fahrenheit);

		
		}
	}
