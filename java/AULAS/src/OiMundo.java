import java.util.Scanner;

public class OiMundo {
	
	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		String nome;
		int anoNascimento=1996;
		int anoAtual=2021;
		
		System.out.print("Oi mundo, turma 33");
		System.out.print("\nAle");
		System.out.println("\nOi");
		
		//entradas
		System.out.print("Digite o nome: ");
		//leia(nome)
		nome = leia.next().toUpperCase();
		System.out.print("Digite o ano de nascimento: ");
		anoNascimento = leia.nextInt();
		
		System.out.println(nome.toUpperCase()+" sua idade é "+(anoAtual-anoNascimento));
		System.out.println("" +nome.length());
		
	
	}
}
