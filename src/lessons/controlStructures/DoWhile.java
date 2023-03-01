/* --------------------------------------------------------------------------
 * APUNTES:
 * 		   Los <do while> se ejecutan una vez y luego comprueban la condición
 *		   para continuar con la siguiente iteración.
-------------------------------------------------------------------------- */

package lessons.controlStructures;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int n = 0;

		do {
			System.out.println("Ingrese un número (entre 0 y 10):");
			n = read.nextInt();

			if (n < 0 || n > 10) {
				System.out.printf("¡Error! El número %d no se encuentra entre 0 y 10. Vuelva a intentar...\n", n);
			}
		} while (n < 0 || n > 10);
		read.close();
	}
}
