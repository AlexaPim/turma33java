import java.util.Scanner;

public class Lista1Ex1 {
	
	public static void main(String[] args) {
				
		Scanner leia = new Scanner(System.in);
		int anos, meses, dias;
		int idadeEmDias;
		
		System.out.print("Digite sua idade em anos: ");
		anos = leia.nextInt();
		
		System.out.print("Digite meses a partir da sua idade completa: ");
		meses = leia.nextInt();
		
		System.out.print("Digite dias após mais um mês completo: ");
		dias = leia.nextInt();
		
		idadeEmDias = anos * 365 + meses * 30 + dias;
		
		System.out.print("Sua idade em dias é aproximadamente: " +idadeEmDias );
		
		
	}

}
