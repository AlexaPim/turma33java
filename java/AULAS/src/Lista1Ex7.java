import java.util.Scanner;

public class Lista1Ex7 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);		
		int a, b, c, d, e, f, x, y;
		
		System.out.print("a: ");
		a = leia.nextInt();
		System.out.print("b: ");
		b = leia.nextInt();
		System.out.print("c: ");
		c = leia.nextInt();
		System.out.print("d: ");
		d = leia.nextInt();
		System.out.print("e: ");
		e = leia.nextInt();
		System.out.print("f: ");
		f = leia.nextInt();
		
		 x = ((c * e) - (b * f)) / ((a * e) - (b * d));
		 y = ((a * f) - (c * d)) / ((a * e) - (b * d));
		 
		 System.out.print("O valor de X: "+x);
		 System.out.print("O valor de Y: "+y);
		

	}

}
