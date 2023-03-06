/* --------------------------------------------------------------------------
 * APUNTES:
 * 		   Archivo donde se demuestra el uso de enumeraciones.
 *
 *
 * IMPORTANTE:
 *  			  - XXX.
-------------------------------------------------------------------------- */

package lessons.enumerations;

public class Main {

	public static void main(String[] args) {
		System.out.println(Days.SUNDAY); // Obtengo un elemento (enumeración simple).
		System.out.println(Continents.AMERICA.getCountries()); // Obtengo el dato de un elemento (enumeración compleja).
	}
}
