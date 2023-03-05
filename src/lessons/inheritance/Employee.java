/* --------------------------------------------------------------------------
 * APUNTES:
 * 		   Ejemplo de una clase hija de la clase padre <Person>.
 *
 *
 * IMPORTANTE:
 *  			  - <extends> = Se utiliza para definir la clase padre, 
 *								heredando los atributos, constructores
 *								y métodos de este.
 *  			  - <super> = Referencia a la clase padre pudiendo obtener
 *							  los atributos o métodos del mismo.
 *  			  - <super()> = Referencia a la clase padre llamando al
 *							    constructor/método respectivamente.
-------------------------------------------------------------------------- */

package lessons.inheritance;

public class Employee extends Person {

	// Atributos
	private int ID;
	private double salary;

	private static int nEmployees; // Número de empleados.

	// Constructores
	public Employee(double salary, String name) {
		super(name);
		this.ID = ++Employee.nEmployees; // ID de tipo AUTO_INCREMENT.
		this.salary = salary;
	}

	// Getters
	public int getID() {
		return this.ID;
	}

	public double getSalary() {
		return this.salary;
	}

	// Setters
	public void setSalary(double salary) {
		this.salary = salary;
	}

	// Métodos
	public String getData() { // Ejemplo del polimorfismo.
		return super.getData() + " | Sueldo: %s".formatted(this.salary);
	}

	// toString
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [ID=");
		builder.append(this.ID);
		builder.append(", salary=");
		builder.append(this.salary);
		builder.append(", ");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
