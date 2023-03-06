/* --------------------------------------------------------------------------
 * APUNTES:
 * 		    Las clases abstractas no se pueden construir, pero si pueden ser
 *			"padres" de otras clases
 *
 *
 * IMPORTANTE:
 *  			  - <abstract> = Indica que dicha clase/método es abstracta/o.
 *  			  - Los métodos abstractos de una abstracción obligan a los
 *					"hijos", de dicha abstracción, a implementarlos.
-------------------------------------------------------------------------- */

package lessons.abstracts;

public abstract class Figure {

	// Atributos
	protected String type;

	// Constructores
	protected Figure(String type) {
		this.type = type;
	}

	// Getters
	public String getType() {
		return this.type;
	}

	// Setters
	public void setType(String type) {
		this.type = type;
	}

	// Métodos
	public abstract void draw();

	// toString
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Figure [type=");
		builder.append(type);
		builder.append("]");
		return builder.toString();
	}
}
