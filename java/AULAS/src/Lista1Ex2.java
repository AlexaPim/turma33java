import java.util.Scanner;

public class Lista1Ex2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade, mes, dias, idadeEmDias;
		
		System.out.print("Digite sua idade em dias: ");
		idadeEmDias = leia.nextInt();
		
		idade = idadeEmDias/365;
		mes = (idadeEmDias%365)/30;
		dias = (idadeEmDias%365)%30;
		
		System.out.print("Sua idade é " +idade+ " anos, " +mes+ " mes(es) e " +dias+ " dias.");
	}

}
