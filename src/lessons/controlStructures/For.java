/* --------------------------------------------------------------------------
 * APUNTES:
 * 		   Los <for> se ejecutan si la condición se cumple y aplican su
 *		   operación definida luego de la primer ejecución.
-------------------------------------------------------------------------- */

package lessons.controlStructures;

public class For {

	public static void main(String[] args) {
		int n = 8;

		for (int i = 0; i <= 10; i++) {
			System.out.printf("%d x %d = %d\n", n, i, n * i);
		}
	}
}
