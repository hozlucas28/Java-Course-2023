/* --------------------------------------------------------------------------
 * APUNTES:
 * 		   Las clases envolventes son objetos que nos permiten declarar
 *		   tipos de datos, pero que poseen métodos para operar sobre estos.
 *		   Por ejemplo, poseen métodos de casting.
-------------------------------------------------------------------------- */

package lessons.enclosingClasses;

public class Main {

	public static void main(String[] args) {
		Integer n = 10;
		System.out.println("Entero --> " + n + " --> " + (n + n));

		String nStr = n.toString(); // Método del objeto.
		System.out.println("Entero a String --> " + nStr + " --> " + (nStr + nStr));

		Double nDou = n.doubleValue(); // Método del objeto.
		System.out.println("Entero a Double --> " + nDou + " --> " + (nDou + nDou));
	}
}
