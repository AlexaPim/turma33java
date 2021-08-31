import java.util.Scanner;

public class Lista1Ex4 {
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int a, b, c;
		int r, s, d;
		
		System.out.print("Qual o valor de a? ");
		a = leia.nextInt();
		System.out.print("Qual o valor de b? ");
		b = leia.nextInt();
		System.out.print("Qual o valor de c? ");
		c = leia.nextInt();
		
		r = (int) (Math.pow(a + b,2)) ;
		s = (int) (Math.pow(b + c,2)) ;
		d = (int) (r + s/2);
		
		System.out.print("O valor da expressão é: " +d);
		
	}
}
