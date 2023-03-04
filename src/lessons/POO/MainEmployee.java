/* --------------------------------------------------------------------------
 * APUNTES:
 * 		   Archivo de ejecución de la clase <Employee> definida
 *		   en <classes/Employee.java>
-------------------------------------------------------------------------- */

package lessons.POO;

import lessons.POO.classes.Employee;

public class MainEmployee {

	public static void main(String[] args) {
		Employee emp = new Employee("Lucas", 21, true);

		// Métodos getters para obtener atributos
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		System.out.println(emp.isActive());

		// Métodos setters para modificar atributos
		emp.setName("Nahuel");
		emp.setAge(32);
		emp.setActive(false);

		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		System.out.println(emp.isActive());

		System.out.println(emp); // Uso del método <toString>.
	}
}
