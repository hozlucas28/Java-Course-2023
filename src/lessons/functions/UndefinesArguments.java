/* --------------------------------------------------------------------------
 * APUNTES:
 * 		   En esta aplicación se demuestra un ejemplo de una función que
 *		   recibe una cantidad indefinida de argumentos, pero sabiendo de que
 *		   tipo de dato son estos.
 *
 *
 * IMPORTANTE:
 *  			  - Los argumentos recibidos son almacenados en un <array>.
-------------------------------------------------------------------------- */

package lessons.functions;

public class UndefinesArguments {

	public static void main(String[] args) {
		add("El resultado de la suma es %d", 1, 5, 9, 7, 5, 3);
	}

	static void add(String message, int... numbers) {
		int result = 0;

		for (int i : numbers) {
			result += i;
		}

		System.out.printf(message, result);
	}
}
