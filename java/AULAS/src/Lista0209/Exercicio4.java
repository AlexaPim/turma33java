package Lista0209;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
	// Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas psicol�gicas
	//dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas era perguntado:
	//idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es (1, se a pessoa 
	//era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
	//Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, 
	//calcule e mostre: (WHILE)
	//o n�mero de pessoas calmas; 
	//o n�mero de mulheres nervosas; 
	//o n�mero de homens agressivos; 
	//o n�mero de outros calmos;
	//o n�mero de pessoas nervosas com mais de 40 anos; 
	//o n�mero de pessoas calmas com menos de 18 anos.
		Scanner leia = new Scanner(System.in);
		
		int  contador=0, pessoaCalma=0, mulherNervosa=0, homemAgressivo=0; 
		int outroCalmo=0, pessoaNervosa40=0, pessoaCalma18=0, idade=0, sexo=0, temperamento=0;

		while ( contador<=150) {
			System.out.println("Qual a sua idade?: ");
			idade = leia.nextInt();
			System.out.println("Qual o seu sexo?\n(1-feminino / 2-masculino / 3-Outros)  :");
			sexo = leia.nextInt();
			System.out.println("Qual o seu temperamento?(\n1- calmo\n2- nervoso\n3- agressivo\n ");
			temperamento = leia.nextInt();
			//pessoas calmas
			if (temperamento==1) {
				pessoaCalma++;
				//outros calmas
				if (sexo==3) {
					outroCalmo++;
				}
				if (idade<18) {
					pessoaCalma18++;
				}
			}
				//pessoas nervosa
			if (temperamento==2) {
				if (sexo==1) {
					mulherNervosa++;
				}
				if (idade>40) {
					pessoaNervosa40++;	
				}
			}
			if (sexo==2 && temperamento==3) {
				homemAgressivo++;


			}
			contador++;
		}
		System.out.printf("\no n�mero de pessoas calmas �:"+pessoaCalma);
		System.out.printf("\no n�mero de mulheres nervosas �:"+mulherNervosa);
		System.out.printf("\no n�mero de homens agressivos:"+homemAgressivo);
		System.out.printf("\no n�mero de outros calmos:"+outroCalmo);
		System.out.printf("\no n�mero de pessoas nervosas com mais de 40 anos �:"+pessoaNervosa40);
		System.out.printf("\no n�mero de pessoas calmas com menos de 18 anos �:"+pessoaCalma18);
		

	}

}
