/* --------------------------------------------------------------------------
 * APUNTES:
 * 		   Los <forEach> me permiten recorrer <arrays> (arreglos),
 *		   <ArrayList>, <Set> y matrices multidimensionales obteniendo los
 *		   elementos que los/las componen.
-------------------------------------------------------------------------- */

package lessons.controlStructures;

public class ForEach {

	public static void main(String[] args) {
		String[] names = { "Lucas", "Nahuel", "Juan", "Marcos", "Maria", "Jonathan" };

		for (String name : names) {
			System.out.println(name);
		}
	}
}
