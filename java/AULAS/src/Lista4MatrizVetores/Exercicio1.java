package Lista4MatrizVetores;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		
		int vetor[] = new int [5];
		int x, maior=(int) 0.0;
        System.out.println(" -Verificando a maior nota-: ");

        for (x=0; x<vetor.length; x++){
            System.out.println("\nDigite um valor: ");
            vetor[x] = leia.nextInt();
        }
        System.out.println("\nPontuação é: ");

        for (x=0; x<5; x++){
            System.out.println("["+vetor[x]+"]");
        }
        for (x=0; x<5; x++){
            if (vetor[x]>maior){
                maior=vetor[x];
            }
        }
        System.out.println("\nA maior nota é: "+maior);
		}

}
