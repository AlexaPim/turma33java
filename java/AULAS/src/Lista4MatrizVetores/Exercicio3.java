package Lista4MatrizVetores;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
	// Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
	//a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
	//b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.
		Scanner leia = new Scanner(System.in);
		
		int[][]n1 = new int [4][6]; 
		int[][]n2 = new int [4][6]; 
		int[][]m1 = new int [4][6];
		int[][]m2 = new int [4][6];				
			
			for (int x = 0; x <4; x ++) {
				for (int y = 0; y <6; y ++) {
					System.out.printf("\nDígito o valor da matriz N1 na linha %d e na coluna %d: ",x+1,y+1);
					n1[x][y] = leia.nextInt();
				}
			}
			for (int x = 0; x <4; x ++) {
				for (int y = 0; y <6; y ++) {
					System.out.printf("\nDígito o valor da matriz N2 na linha %d e na coluna %d: ",x+1, y+1);
					n2 [x][y] = leia.nextInt();
				}
			}
			for (int x = 0; x <4; x ++) {
				for (int y = 0; y <6; y ++) {
					m1 [x][y] = n1 [x][y] + n2 [x][y];
				}
			}
			for (int x = 0; x <4; x ++) {
				for (int y = 0; y <6; y ++) {
					if (n1 [x][y]> n2 [x][y]) {
						m2 [x][y] = n1 [x][y] -n2 [x][y];
					}
					else {
						m2 [x][y] = n2 [x][y] - n1 [x][y];
					}

				}
			}
			System.out.printf("\nA matriz M1 é:");	
			for (int x = 0; x <4; x ++) {
				System.out.printf ("\n");
				for (int y = 0; y <6; y ++) {
					System.out.printf("",m1[x][y],"\t");	
				}
			}
			System.out.printf("\nA matriz M2 é:");
			for (int x = 0; x <4; x ++) {
				System.out.printf ("\n");
				for (int y = 0; y <6; y ++) {
					System.out.printf("",m2[x][y],"\t");
					

				}

			}
		}
}
