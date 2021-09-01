package Lista2ExerciciosEmJava;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		//Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
		//10-14 infantil
		//15-17 juvenil
		//18-25 adulto
		
		Scanner leia = new Scanner(System.in);
		int idade;
		
		System.out.println("Informe sua idade: ");
		idade = leia.nextInt();
		
		if (idade>25 || idade<10) {
			System.out.println("Nenhuma categoria informada para essa idade.");
		}
		else if (idade >= 10 && idade <=14) {
			System.out.println("Você está na categoria 'Infantil'.");
		}
		else if (idade >=15 && idade <=17) {
			System.out.println("Você está na categoria 'Juvenil'.");
		}
		else {
			System.out.println("Você está na categoria 'Adulto'.");
		}
	}

}
