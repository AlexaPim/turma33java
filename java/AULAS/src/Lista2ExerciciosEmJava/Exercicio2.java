package Lista2ExerciciosEmJava;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
		
		Scanner leia = new Scanner(System.in);

		int n1, n2, n3;
		
		System.out.println("Entre apenas com n�mero POSITIVO.\n");
		
		System.out.println("Digite o primeiro n�mero: ");
		n1 = leia.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		n2 = leia.nextInt();
		System.out.println("Digite o terceiro n�mero: ");
		n3 = leia.nextInt();
		
		if (n1 <= n2 && n1 <= n3) {
			if (n2 <= n3) {
				System.out.println("Os numeros em ordem crescente s�o: "+n1+", "+n2+", "+n3);
			}
			else {
				System.out.println("Os numeros em ordem crescente s�o: "+n1+", "+n3+", "+n2);
			}
		}
			else if (n2 <= n3) {
				if (n1 <= n3) {
					System.out.println("Os numeros em ordem crescente s�o: "+n2+", "+n1+", "+n3);
				}
				else {
					System.out.println("Os numeros em ordem crescente s�o: "+n2+", "+n3+", "+n1);
				}
			}
				else  {
					if (n1 <= n2) {
						System.out.println("Os numeros em ordem crescente s�o: "+n3+", "+n1+", "+n2);
					}
					else {
						System.out.println("Os numeros em ordem crescente s�o: "+n3+", "+n2+", "+n1);
					}
				}
		}
}

