import java.util.Scanner;

public class Lista1Ex3 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int horas, minutos, segundos, segundosDoEvento;
		
		System.out.print("Digite qual foi o tempo de dura��o de um evento na f�brica expressa em segundos: ");
		segundosDoEvento = leia.nextInt();
		
		horas=segundosDoEvento/3600;
		minutos=(segundosDoEvento%3600)/60;
		segundos=(segundosDoEvento%3600)%60;
		
		System.out.print("O evento na f�brica teve o tempo estimado em: "+horas+ " hora(s), " + minutos + " minuto(s) e " + segundos + " segundo(s).");

		
	}
}
