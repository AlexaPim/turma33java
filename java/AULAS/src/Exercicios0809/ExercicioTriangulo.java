package Exercicios0809;

import java.util.Scanner;

public class ExercicioTriangulo {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double altura, base, areaT;
		double alturaB, baseB, areaTB;
		double maiorArea;

		System.out.print("Digite o valor da altura do triangulo retangulo A em (cm) ");
		altura = leia.nextDouble();
		System.out.print("Digite o valor da base do triangulo retangulo A em (cm) ");
		base = leia.nextDouble();
		
		areaT=((altura*base)/2);		
		System.out.printf("O valor da área do triângulo retângulo A é de: %.2f\n",areaT);
		
		
		System.out.print("\nDigite o valor da altura do triangulo retangulo B em (cm) ");
		alturaB = leia.nextDouble();
		System.out.print("Digite o valor da base do triangulo retangulo B em (cm) ");
		baseB = leia.nextDouble();
		
		areaTB=((alturaB*baseB)/2);		
		System.out.printf("O valor da área do triângulo retângulo B é de: %.2f\n",areaTB);
		
		if(areaT==areaTB) {
			System.out.print("\nTriângulos com áreas iguais\n");
		} else if (areaT > areaTB){
			System.out.print("\nO triângulo da área A é maior que o da área B\n");
		} else {
			System.out.print("\nO triângulo da área B é maior que o da área A\n");
		}
	}
}
