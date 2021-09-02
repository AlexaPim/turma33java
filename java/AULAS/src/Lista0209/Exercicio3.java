package Lista0209;

import java.util.Scanner;

public class Exercicio3 {
	public static void main (String args[]) {
		//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 
		//21 anos. Total de pessoas com mais de 50 anos. O programa termina quando 
		//idade for =-99. (WHILE)
		
		Scanner leia = new Scanner(System.in);
		
		int idade, menor21=0, maior50=0;
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		while(idade > -99) {
			if (idade < 21 && idade >=0) {
				menor21++;
			}
			else if (idade > 50) {
				maior50++;
			}
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
		}
		System.out.printf("Pessoas menores de 21 anos: %d.",menor21);
		System.out.printf("\nPessoas a partir de 50 anos: %d.",maior50);
	}
}
