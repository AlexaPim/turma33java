package exemplo;

import java.util.Scanner;

public class CadNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		//cadeia nome[4]Array
		String agenda[][] = new String[24][31];
		int auxHora, auxDias;
		char op;
		
		do {
			System.out.println("Digite o dia do evento: ");
			auxDias = leia.nextInt()-1;
			System.out.println("Digite a hora do evento: ");
			auxHora = leia.nextInt();
			leia.nextLine();
			System.out.println("Informe o evento: ");
			agenda[auxHora][auxDias]=leia.nextLine();
			System.out.println("Continua S/N ");
			op = leia.next().toUpperCase().charAt(0);
			System.out.println();
			
		} while (op!='N');
		System.out.println("Imprimindo agenda ");
		for (int dias = 0; dias<31; dias++) {
			for(int hora = 0; hora<24; hora++ ) {
				if(agenda[hora][dias] !=null) {
					System.out.printf("Dia %d, hora %d:00hrs: %s\n", dias+1, hora,agenda[hora][dias]);
				}
				
			}
				
		}
		
		
	}

}
