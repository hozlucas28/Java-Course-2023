/* --------------------------------------------------------------------------
 * APUNTES:
 * 		   Los <Set> son <ArrayList> y se comportan como tal, pero con
 *		   importantes diferencias.
 *
 *
 * IMPORTANTE:
 *  			  - Los <Set> no permite almacenar datos repetidos,
 *					característica principal.
 *  			  - El orden en que se agregaron los elementos al <Set>
 *					no es respetado, es decir, es aleatorio.
-------------------------------------------------------------------------- */

package lessons.dataPersistence;

import java.util.HashSet;
import java.util.Set;

public class MySet {

	public static void main(String[] args) {
		Set days = new HashSet(); // Inicialización del <Set>.

		// Añado elementos
		days.add("Lunes");
		days.add("Lunes");
		days.add("Martes");
		days.add("Miércoles");
		days.add("Jueves");
		days.add("Viernes");

		for (Object day : days) {
			System.out.println(day);
		}

		// Elimino un elemento según su valor/contenido
		days.remove("Miércoles");

		for (Object day : days) {
			System.out.println(day);
		}

		// Elimino todos los elementos
		days.clear();

		for (Object day : days) {
			System.out.println(day);
		}
	}
}
