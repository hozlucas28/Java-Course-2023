/* --------------------------------------------------------------------------
 * APUNTES:
 * 		   Archivo de ejecución de la clase <Person> definida
 *		   en <Person.java> y sus respectivas hijas.
 *
 *
 * IMPORTANTE:
 *  			  - La herencia se utiliza para no repetir código.
 *  			  - Polimorfismo = Se trata de sobrescribir constructores/métodos
 *								   de la clase padre.
 *  			  - <instanceof> = Me permite comparar la igualdad entre dos objetos.
 *  			  - <Upcasting> = Casting de un objeto hijo al objeto padre.
 *  			  - <Downcasting> = Casting de un objeto padre a un objeto hijo.
-------------------------------------------------------------------------- */

package lessons.inheritance;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// Padre <Person>
		Person p1 = new Person("Lucas", 'M', 21, "Moreno");
		System.out.println(p1);

		// Hijo <Employee>
		Employee e1 = new Employee(3000, "Lucas");
		System.out.println(e1);

		Date date = new Date(); // Fecha actual.

		// Hijo <Client>
		Client c1 = new Client("Lucas", 'M', 21, "Moreno", date, true);
		System.out.println(c1);

		// Demostración del polimorfismo
		System.out.println(p1.getData());
		System.out.println(e1.getData());
		System.out.println(c1.getData());

		// Demostración de <instanceof>
		checkType(p1);
		checkType(e1);
		checkType(c1);

		// Downcasting (padre a hija)
		Person p2 = new Employee(4000, "Martin");
		Employee e4 = (Employee) p2; // <Person> --> <Employee>.
		System.out.println(e4.getSalary());

		// Upcasting (hija a padre)
		Person p3 = e4; // <Employee> --> <Person>.
		System.out.println(p3.getData());
	}

	public static void checkType(Object obj) {
		/*
			Observar que se empieza por el hijo más lejano al
			padre más jerárquico (alto).
		*/

		if (obj instanceof Employee) {
			System.out.println("¡El objeto es de tipo <Employee>!");
		} else if (obj instanceof Person) {
			System.out.println("¡El objeto es de tipo <Person>!");
		} else if (obj instanceof Client) {
			System.out.println("¡El objeto es de tipo <Client>!");
		} else if (obj instanceof Object) {
			System.out.println("¡El objeto es de tipo <Object>!");
		}
	}
}
