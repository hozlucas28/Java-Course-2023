/* --------------------------------------------------------------------------
 * APUNTES:
 * 		   Los <ArrayList> son arreglos que almacenan objetos y/o elementos
 *		   de distinto tipo de dato. No es necesario definir su longitud.
 *
 *
 * IMPORTANTE:
 *  			  - Los <ArrayList> pueden almacenar elementos repetidos.
 *  			  - El orden en que se agregaron los elementos al <ArrayList>
 *					es respetado.
 *  			  - Puedo utilizar las instrucciones <forEach> para recorrer
 *					y obtener los elementos del <ArrayList>.
-------------------------------------------------------------------------- */

package lessons.dataPersistence;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {
		List l1 = new ArrayList(); // Inicialización del <ArrayList>.

		// Añado elementos
		l1.add("Lucas"); // <ARRAYLIST>.add(<NEW ELEMENT>);
		l1.add(21);
		l1.add(45.263);
		l1.add(true);
		System.out.println(l1);

		// Obtengo un elemento
		var e = l1.get(1); // <ARRAYLIST>.get(<INDEX>);
		System.out.println(e);

		// Elimino un elemento
		l1.remove(0); // <ARRAYLIST>.remove(<INDEX>);
		System.out.println(l1);

		// Modifico un elemento
		l1.set(2, "Modificado"); // <ARRAYLIST>.set(<INDEX>, <NEW CONTENT>);
		System.out.println(l1);

		// Elimino todos los elementos
		l1.clear();
		System.out.println(l1);
	}
}
