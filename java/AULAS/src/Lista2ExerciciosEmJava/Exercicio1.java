package Lista2ExerciciosEmJava;

import java.util.Scanner;

public class Exercicio1 {
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		int n1, n2, n3;
		
		System.out.println("Digite o primeiro n�mero: ");
		n1 = leia.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		n2 = leia.nextInt();
		System.out.println("Digite o terceiro n�mero: ");
		n3 = leia.nextInt();
		
		if (n1>n2 && n1>n3) {
			System.out.printf("O n�mero %d � maior",n1);	
		}
		else if (n2>n3) {
			System.out.printf("O n�mero %d � maior",n2);
		}
		else {
			System.out.printf("O n�mero %d � maior",n3);
		}
	}
}
