/* --------------------------------------------------------------------------
 * APUNTES:
 * 		   Archivo donde se demuestra el comportamiento de clases que
 *		   implementan una clase abstracta.
-------------------------------------------------------------------------- */

package lessons.abstracts;

public class Main {

	public static void main(String[] args) {
		Figure fRect = new Rectangle("Rectángulo"); // Inicialización de un objeto que implementa una abstracción.
		System.out.println(fRect);
		fRect.draw();

		Figure fSqu = new Square("Cuadrado"); // Inicialización de un objeto que implementa una abstracción.
		System.out.println(fSqu);
		fSqu.draw();
	}
}
