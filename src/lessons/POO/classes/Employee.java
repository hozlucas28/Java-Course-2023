/* --------------------------------------------------------------------------
 * APUNTES:
 * 		   El encapsulamiento trata sobre utilizar atributos y métodos
 *		   privados pudiendo ser accedidos y/o modificados a través de los
 *		   getters (obtenedores) y setters (modificadores).
 *
 *
 * IMPORTANTE:
 *  			  - <toString> = Le permite al objeto retornar un <String>
 *								 con los valores de sus atributos.
-------------------------------------------------------------------------- */

package lessons.POO.classes;

public class Employee {

	// Atributos
	private String name;
	private int age;
	private boolean active;

	// Constructores
	public Employee(String name, int age, boolean active) {
		this.name = name;
		this.age = age;
		this.active = active;
	}

	// Getters
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public boolean isActive() {
		return active;
	}

	// Setters
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	// toString
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", active=" + active + "]";
	}
}
