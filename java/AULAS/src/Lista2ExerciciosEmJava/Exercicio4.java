package Lista2ExerciciosEmJava;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {	
	//Fa�a um programa em que permita a entrada de um n�mero qualquer e 
	//exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz 
	//quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.
		
		Scanner leia = new Scanner(System.in);
		
		double resultado, numero;
		System.out.println("Digite um numero inteiro positivo: ");
		numero = leia.nextDouble();
		
		if (numero < 0) {
			System.out.println("Numero negativo");
		}
		else if (numero == 0) {
			System.out.println("N�mero neutro");
		}
		else if (numero % 2 == 0) {
			System.out.println("N�mero par");
			resultado=Math.sqrt(numero);
			System.out.printf("A raiz quadrada do numero �: %.2f",resultado);
		}
		else {
			System.out.println("N�mero �mpar.");
			resultado=Math.pow((numero),2);
			System.out.println(numero+" elevado ao quadrado � igual a: "+resultado);
		}

	}
}