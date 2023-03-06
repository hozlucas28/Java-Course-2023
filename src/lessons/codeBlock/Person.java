/* --------------------------------------------------------------------------
 * IMPORTANTE:
 *  			  - Los bloques estáticos se ejecutan una solo vez, cuando
 *					el primer objeto de la clase se construye.
 *  			  - Las instrucciones no estáticas, como <this>, no pueden
 *					ser empleados en bloques estáticos. Mientras que en los
 *					bloques dinámicos solo se pueden emplear instrucciones
 *					dinámicas, es decir, no estáticas.
-------------------------------------------------------------------------- */

package lessons.codeBlock;

public class Person {

	private final int id;
	private static int nPersons;

	// Bloque estático
	static {
		System.out.println("¡Bloque estático ejecutado!");
		++Person.nPersons;
	}

	// Bloque dinámico (no estático)
	{
		System.out.println("¡Bloque dinámico ejecutado!");
		this.id = Person.nPersons++;
	}

	// Constructores
	public Person() {
		System.out.println("Objeto construido.");
	}

	// Getters
	public int getId() {
		return this.id;
	}

	// toString
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [id=");
		builder.append(id);
		builder.append("]");
		return builder.toString();
	}
}
