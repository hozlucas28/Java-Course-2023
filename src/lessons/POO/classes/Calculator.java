/* --------------------------------------------------------------------------
 * IMPORTANTE:
 *  			  - Los constructores y métodos pueden ser sobrecargados.
 *  			  - <final> = Permite declarar la variable o atributo como constante, es decir, inmodificable.
 *  			  - <static> = Permite acceder a dicho atributo/método de la clase sin instanciar un objeto de la misma.
-------------------------------------------------------------------------- */

package lessons.POO.classes;

public class Calculator {

	// Atributos
	public static final double PI = 3.141592;

	// Métodos
	public static final int add(int a, int b) {
		return a + b;
	}

	public static final double add(double a, double b) {
		return a + b;
	}
}
