/* --------------------------------------------------------------------------
 * APUNTES:
 * 		   Los <Map> se caracterizan por ser <ArrayList> en donde los
 *		   elementos se almacenan por clave, utilizando la misma para
 *		   acceder al valor del elemento en vez de acceder es este
 *		   mediante su índice.
 *
 *
 * IMPORTANTE:
 *  			  - La clave y valor puede ser de cualquier tipo de dato.
 *  			  - <<MAP>.keySet()> = Devuelve un arreglo con las llaves del <Map>.
 *  			  - <<MAP>.values()> = Devuelve un arreglo con los valores del <Map>.
-------------------------------------------------------------------------- */

package lessons.dataPersistence;

import java.util.HashMap;
import java.util.Map;

public class MyMap {

	public static void main(String[] args) {
		Map numbers = new HashMap(); // Inicialización del <Map>.

		// Añado elementos con clave
		numbers.put(1, "Uno"); // <MAP>.put(<KEY>, <VALUE/CONTENT>);
		numbers.put(2, "Dos");
		numbers.put(3, "Tres");
		numbers.put(4, "Cuatro");
		numbers.put(5, "Cinco");
		System.out.println(numbers);

		// Obtengo el valor de un elemento según su clave
		var e = numbers.get(1); // <MAP>.get(<KEY>);
		System.out.println(e);

		// Elimino un elemento según su clave
		numbers.remove(4);
		System.out.println(numbers);

		// Recorro el <Map> para mostrar las claves
		for (Object key : numbers.keySet()) {
			System.out.println(key);
		}

		// Recorro el <Map> para mostrar los valores
		for (Object value : numbers.values()) {
			System.out.println(value);
		}
	}
}
