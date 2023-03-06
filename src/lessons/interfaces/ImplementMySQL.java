/* --------------------------------------------------------------------------
 * APUNTES:
 * 		   Ejemplo de una clase que implementa una interfaz.
 *
 *
 * IMPORTANTE:
 *  			  - Las clases que implementan una interfaz están obligadas
 *					a definir los métodos de dicha interfaz.
 *  			  - <implements> = Indica la interfaz a implementar.
-------------------------------------------------------------------------- */

package lessons.interfaces;

public class ImplementMySQL implements IDataBase {

	// Métodos
	public void list() {
		System.out.println("Se listaron los datos.");
	}

	public void insert() {
		System.out.println("Se inserto un dato.");
	}

	public void delete() {
		System.out.println("Se elimino un dato.");
	}

	public void update() {
		System.out.println("Se actualizo un dato.");
	}
}
