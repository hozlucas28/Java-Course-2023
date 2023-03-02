/* --------------------------------------------------------------------------
 * APUNTES:
 * 		   <Math> es un clase ya incluida en Java para realizar operaciones
 *		   matemáticas.
 *
 *
 * IMPORTANTE:
 *  			  - El redondeo es hacia arriba si el decimal de dicho
 *					argumento es igual o superior a 5.
-------------------------------------------------------------------------- */

package lessons.functions;

public class MyMath {

	public static void main(String[] args) {
		System.out.println(Math.E); // Número E.
		System.out.println(Math.PI); // Número Pi.

		System.out.println(Math.pow(2, 3)); // 2^3.
		System.out.println(Math.sqrt(64)); // Raíz cuadrada de 64.

		// Números aleatorios
		System.out.println(Math.random()); // Entre 0 y 1.
		System.out.println(Math.random() * 101); // Entre 0 y 100.

		// Casteos
		int rndInt = (int) (Math.random() * 101); // <double> --> <integer>.
		System.out.println(rndInt);

		float myFloat = (float) (100); // <integer> --> <float>.
		System.out.println(myFloat);

		// Máximos y mínimos
		System.out.println(Math.max(9, 7)); // Obtener máximo.
		System.out.println(Math.min(9, 7)); // Obtener mínimo.

		// Redondeos
		System.out.println(Math.round(5.8)); // Hacia arriba.
		System.out.println(Math.round(5.4)); // Hacia abajo.
	}
}
