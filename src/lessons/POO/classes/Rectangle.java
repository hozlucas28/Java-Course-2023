/* --------------------------------------------------------------------------
 * IMPORTANTE:
 *  			  - <this> = Se utiliza para acceder a los atributos del objeto.
-------------------------------------------------------------------------- */

package lessons.POO.classes;

public class Rectangle {

	// Atributos
	public int base;
	public int height;

	// Constructores
	public Rectangle() {
		System.out.println(base);
		System.out.println(height);
	}

	// Métodos
	public int area(int b, int h) {
		this.base = b;
		this.height = h;

		return this.base * this.height;
	}

	public int perimeter(int b, int h) {
		this.base = b;
		this.height = h;

		return (this.base + this.height) * 2;
	}
}
