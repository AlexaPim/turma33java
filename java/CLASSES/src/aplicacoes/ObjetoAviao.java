package aplicacoes;

import classe.Aviao;

public class ObjetoAviao {

	public static void main(String[] args) {
		
		Aviao aviao = new Aviao(1998, true, '1', "Air-771");
		
		System.out.println("Bom dia!");
		System.out.println("Informações do avião: \n");
		
		aviao.ativo();		
		aviao.marca();
		System.out.printf("Ano do modelo: %d",aviao.getAno());
		System.out.printf("\nCompanhia selecionada: %s ",aviao.companhiaAerea());
		
		
		
		

	}

}
