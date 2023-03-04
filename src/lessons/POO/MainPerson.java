/* --------------------------------------------------------------------------
 * APUNTES:
 * 		   Archivo de ejecución de la clase <Person> definida
 *		   en <classes/Person.java>
-------------------------------------------------------------------------- */

package lessons.POO;

import lessons.POO.classes.Person;

public class MainPerson {

	public static void main(String[] args) {
		// Inicialización de objetos tipo <Person>
		Person person1 = new Person();
		Person person2 = new Person("Lucas");

		// Definición de atributos
		person1.name = "Lucas";
		person1.age = 21;

		// Llamada a métodos
		person1.showData();
	}
}
