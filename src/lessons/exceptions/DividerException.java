/* --------------------------------------------------------------------------
 * APUNTES:
 * 		   Ejemplo de una excepción personalizada.
 *
 *
 * IMPORTANTE:
 *  			  - <RuntimeException> = Clase padre de una excepción de
 *										 ejecución.
-------------------------------------------------------------------------- */

package lessons.exceptions;

public class DividerException extends RuntimeException {

	public DividerException(String message) {
		super(message);
	}
}
