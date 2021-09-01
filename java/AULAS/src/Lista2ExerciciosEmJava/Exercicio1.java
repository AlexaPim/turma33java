package Lista2ExerciciosEmJava;

import java.util.Scanner;

public class Exercicio1 {
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//Faça um programa que receba três inteiros e diga qual deles é o maior.
		int n1, n2, n3;
		
		System.out.println("Digite o primeiro número: ");
		n1 = leia.nextInt();
		System.out.println("Digite o segundo número: ");
		n2 = leia.nextInt();
		System.out.println("Digite o terceiro número: ");
		n3 = leia.nextInt();
		
		if (n1>n2 && n1>n3) {
			System.out.printf("O número %d é maior",n1);	
		}
		else if (n2>n3) {
			System.out.printf("O número %d é maior",n2);
		}
		else {
			System.out.printf("O número %d é maior",n3);
		}
	}
}
