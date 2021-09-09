package Projeto;

import java.util.Scanner;

public class Cabecalho {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
			char resposta = 0;
			
			cabecalho();
			System.out.println("Olá, deseja comprar algo? ");
			resposta = leia.next().charAt(resposta);
			if (resposta == 'S' || resposta == 's'){
				limpa();
				cabecalho();
				pular();
				System.out.print("Iremos te apresentar agora os nossos" + "\n" + "produtos!\n");
				linha();
				
			}	
			else if (resposta == 'N' || resposta == 'n'){
				cabecalho();
				despede();
				linha();
				pular();
				System.out.println("Até breve!!\n");
			}
		}
		public static void cabecalho() {
			limpa();
			linha();
			nome();
			slogan();
			linha();
			pular();
		}
		public static void nome() {
			System.out.println("---Bem-vinde à Devs de int[e]=riores----\n");
		}
		public static void slogan() {
			System.out.println("-------Programando o seu conforto!------\n");
		}
		public static void linha() {
			System.out.println("----------------------------------------\n");
		}
		public static void pular() {
			System.out.println("\n");
		}
		public static void limpa() {
			for(int clear = 0; clear < 20; clear++)
			  {
			     System.out.println(" ") ;
			  }
		}
		public static void agradece() {
			System.out.println("Obrigada por comprar com a Devs de int[e]=riores!\n");
		}
		public static void despede() {
			System.out.println("Obrigada por vir à Devs de int[e]=riores!");
		}
	
	}


