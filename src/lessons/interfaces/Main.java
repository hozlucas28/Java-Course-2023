/* --------------------------------------------------------------------------
 * APUNTES:
 * 		   Archivo para demostrar el uso de interfaces.
-------------------------------------------------------------------------- */

package lessons.interfaces;

public class Main {

	public static void main(String[] args) {
		IDataBase mySQL = new ImplementMySQL();

		mySQL.list();
		mySQL.insert();
		mySQL.delete();
		mySQL.update();
	}
}
