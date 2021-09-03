package exemplo;

import java.util.Scanner;


public class ExemploComMatriz {

	public static void main(String[] args) {
		// Crie um programa que receba valores do usuário para preencher uma matriz 3X3, 
		//e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal, 
		//ou seja, diagonal principal.
		Scanner leia = new Scanner(System.in);		
		
		int[][] matriz = new int [3][3];
		int soma = 0, somaD=0;
		
		for(int x=0;x<3;x++) {
			for(int y=0;y<3;y++) {
				System.out.printf("Digite o valor da matriz na linha %d e na coluna %d: ",x+1,y+1);
				matriz[x][y] = leia.nextInt();
				soma = soma + matriz[x][y];
				if (x==y) {
					somaD = somaD + matriz[x][y];
				}
			}
			System.out.printf("A soma da matriz é: %d. ",soma);
			System.out.printf("\nE a soma da diagonal é: %d. \n",somaD);				
		}
		
	}
	

}
