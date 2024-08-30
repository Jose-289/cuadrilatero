import java.util.Scanner;

public class cuadrilatero {

	public static void main(String[] agrs) {
		//comentarios
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el numero para la base: ");
		int base = entrada.nextInt();
		System.out.println("Introduce el numero para la altura: ");
		int altura = entrada.nextInt();
		
		for (int i=0; i<altura; i++) {
			for (int j=0; j<base; j++) {
				if (i == 0 || i == altura-1) {
					System.out.print("*");
				}
				else if (j == 0 || j == base-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		entrada.close();
	}
}
