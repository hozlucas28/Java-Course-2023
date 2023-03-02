/* --------------------------------------------------------------------------
 * APUNTES:
 * 		   Las funciones recursivas son funciones que se ejecutan sobre si
 *		   mismas el bucle, hasta cumplir una condición que detenga dicho bucle
 *		   de ejecución.
-------------------------------------------------------------------------- */

package lessons.functions;

public class RecursiveFunction {

	public static void main(String[] args) {
		countdown(12);
	}

	static void countdown(int n) {
		n--;

		if (n > 0) {
			System.out.println(n);
			countdown(n);
		} else {
			System.out.println("¡Cuenta regresiva finalizada!");
		}
	}
}
