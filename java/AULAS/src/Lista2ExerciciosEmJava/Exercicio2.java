package Lista2ExerciciosEmJava;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// Faça um programa que entre com três números e coloque em ordem crescente.
		
		Scanner leia = new Scanner(System.in);

		int n1, n2, n3;
		
		System.out.println("Entre apenas com número POSITIVO.\n");
		
		System.out.println("Digite o primeiro número: ");
		n1 = leia.nextInt();
		System.out.println("Digite o segundo número: ");
		n2 = leia.nextInt();
		System.out.println("Digite o terceiro número: ");
		n3 = leia.nextInt();
		
		if (n1 <= n2 && n1 <= n3) {
			if (n2 <= n3) {
				System.out.println("Os numeros em ordem crescente são: "+n1+", "+n2+", "+n3);
			}
			else {
				System.out.println("Os numeros em ordem crescente são: "+n1+", "+n3+", "+n2);
			}
		}
			else if (n2 <= n3) {
				if (n1 <= n3) {
					System.out.println("Os numeros em ordem crescente são: "+n2+", "+n1+", "+n3);
				}
				else {
					System.out.println("Os numeros em ordem crescente são: "+n2+", "+n3+", "+n1);
				}
			}
				else  {
					if (n1 <= n2) {
						System.out.println("Os numeros em ordem crescente são: "+n3+", "+n1+", "+n2);
					}
					else {
						System.out.println("Os numeros em ordem crescente são: "+n3+", "+n2+", "+n1);
					}
				}
		}
}

