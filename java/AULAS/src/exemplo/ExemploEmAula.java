package exemplo;

import java.util.Scanner;

public class ExemploEmAula {

	public static void main(String[] args) {
		// Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de 
		//uma atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.
		Scanner leia = new Scanner(System.in);
		
		int pontos[] = new int [5];
		int x, maior=(int) 0.0;
        System.out.println(" -Verificando a maior nota-: ");

        for (x=0; x<pontos.length; x++){
            System.out.println("\nDigite um valor: ");
            pontos[x] = leia.nextInt();
        }
        System.out.println("\nPontua��o �: ");

        for (x=0; x<5; x++){
            System.out.println("["+pontos[x]+"]");
        }
        for (x=0; x<5; x++){
            if (pontos[x]>maior){
                maior=pontos[x];
            }
        }
        System.out.println("\nA maior nota �: "+maior);
		}
}


