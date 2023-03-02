/* --------------------------------------------------------------------------
 * APUNTES:
 * 		   Las funciones de sobrecarga son funciones que tienen el mismo
 *		   nombre pero se diferencian por los tipos de datos en sus parámetros
 *		   y retornos.
-------------------------------------------------------------------------- */

package lessons.functions;

public class FunctionsOverload {

	public static void main(String[] args) {
		System.out.printf("La suma de enteros es %d\n", add(45, 50));
		System.out.printf("La suma de decimales es %f\n", add(4.5, 4.5));
	}

	// Parámetros de tipo <int>
	static int add(int a, int b) {
		return a + b;
	}

	// Parámetros de tipo <double>
	static double add(double a, double b) {
		return a + b;
	}
}
