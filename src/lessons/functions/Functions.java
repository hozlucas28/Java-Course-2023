/* --------------------------------------------------------------------------
 * APUNTES:
 * 		   Los datos enviados al momento de invocar la función se llaman
 *		   argumentos, mientras que los definidos en la construcción de función
 *		   se llaman parámetros.
 *
 *
 * IMPORTANTE:
 *  			  - <static> = Indica que la función puede ser invocada sin
 *							   instanciar un objeto de dicha clase.
-------------------------------------------------------------------------- */

package lessons.functions;

public class Functions {

	// Punto de entrada de la aplicación.
	public static void main(String[] args) {
		greet();
		add(10, 5);
		System.out.printf("La resta es %d\n", subtract(12, 3));
	}

	static void greet() {
		System.out.println("¡Hola Mundo!");
	}

	// Función con parámetros
	static void add(int a, int b) {
		int result = a + b;
		System.out.printf("La suma es %d\n", result);
	}

	// Función con retorno
	static int subtract(int a, int b) {
		return a - b;
	}
}
