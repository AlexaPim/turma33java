package app;

import java.util.Scanner;

import entities.ContaCorrente;
import entities.ContaEmpresarial;
import entities.ContaEspecial;
import entities.ContaEstudantil;
import entities.ContaPoupanca;

public class TesteConta {
	
public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		ContaEstudantil cest1 = new ContaEstudantil(14,"123.456.789-55",10000);
		ContaPoupanca cp1 = new ContaPoupanca(156,"222.333.444-58",5);
		ContaCorrente cc1 = new ContaCorrente(147,"147.258.369-98",3);
		ContaEspecial cesp1 = new ContaEspecial(148,"369.258.147",3,1000);
		ContaEmpresarial  cemp1 = new ContaEmpresarial(123,"159753852.99",50000);
		
		char tipo;
		double valor=0.00;
		double limite = 0.00;
		char op;
		int dia;
		for (int x=1; x<=10; x++) {
			System.out.println("MOVIMENTO "+x);
			if (cest1.getAccountType().equals("estudantil")) {
				System.out.print("Deseja usar seu limite estudantil ("+ cest1.getLimiteEstudantil() +") S/N ");
				if (leia.next().toUpperCase().charAt(0) == 'S') {
					System.out.println("Digite o valor desejado para o limite");
					limite = leia.nextDouble();
					cest1.usarEstudantil(limite);
				}
			}
			
			System.out.println("SALDO ATUAL R$ : "+cest1.getSaldo());
			System.out.print("Movimento D-débito ou C-crédito?: ");
			
			tipo = leia.next().toUpperCase().charAt(0);
			System.out.print("Digite o valor: ");
			valor = leia.nextDouble();
			if (tipo=='D') {
				cest1.debito(valor);
			} 
			else if (tipo=='C') {
				cest1.credito(valor);
			} else if(tipo == 'L'){
				cest1.usarEstudantil(valor);
			}
			else {
				System.out.println("Não foi informado um tipo correto...");
			}
			System.out.println("Continua S/N : ");
			op = leia.next().toUpperCase().charAt(0);
			if (op=='N') {
				
				break;
			}
			
		}
		System.out.println("SALDO ATUALIZADO R$ "+cest1.getSaldo());		

	}

}
