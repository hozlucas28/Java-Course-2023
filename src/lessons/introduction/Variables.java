/* --------------------------------------------------------------------------
 * APUNTES:
 * 		   Al utilizar la instrucción <var> no hace falta definir el tipo de
 *		   dato de la variable.
-------------------------------------------------------------------------- */

package lessons.introduction;

public class Variables {

	public static void main(String[] args) {
		// Inicialización de variables
		int a, b, c; // <int> para números.
		String name; // <string> para textos.

		// Modificación de variables
		a = 1;
		b = 2;
		c = 3;
		name = "Nahuel";

		System.out.println(a + b + c);
		System.out.println(name);

		// Nueva forma de inicializar variables
		var firstName = "Lucas"; // No hace falta definir el tipo de dato.
		var secondName = "Nahuel";
		var completeName = firstName + secondName;

		System.out.println("• Nombre completo: " + completeName);
	}
}
