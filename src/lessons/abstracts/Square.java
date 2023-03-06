/* --------------------------------------------------------------------------
 * APUNTES:
 * 		   Ejemplo de una clase que implementa una clase abstracta.
 *
 *
 * IMPORTANTE:
 *  			  - <extends> = Me permite emplear una clase padre ó clase
 *								abstracta en este caso.
-------------------------------------------------------------------------- */

package lessons.abstracts;

public class Square extends Figure {

	// Constructores
	protected Square(String type) {
		super(type);
	}

	// Métodos
	public void draw() {
		System.out.println("Se dibuja " + getClass().getSimpleName());
	}
}
