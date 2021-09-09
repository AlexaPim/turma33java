package aplicacoes;

import java.util.Scanner;

import classe.Cliente;

public class ObjetoCliente {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Cliente clin1 = new Cliente("111.222.333.44", "Ana");
		
		clin1.setAnoNascimento(2000);
				
		clin1.ativarCliente();
		
		System.out.printf("Bom dia %s  \n",clin1.tratamento());
		System.out.println("Nome: "+clin1.getNome());
		System.out.println("CPF: "+clin1.getCpf());
		System.out.printf("Cliente, sua idade é %d anos.\n",clin1.mostraIdade());
		
	}

}
