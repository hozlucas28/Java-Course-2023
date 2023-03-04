/* --------------------------------------------------------------------------
 * APUNTES:
 * 		   Las clases/atributos/métodos públicos son aquellos que pueden ser
 *		   exportados y/o modificados por invocaciones externas, mientras que
 *		   las privadas solo pueden ser accedidas/modificadas en el scope donde
 *		   fueron declaradas.
 *
 *
 * IMPORTANTE:
 *  			  - Los constructores y métodos pueden ser sobrecargados.
 *  			  - Los constructores no devuelven nada, por lo que no hay
 *					que definirles un tipo de dato de retorno.
-------------------------------------------------------------------------- */

package lessons.POO.classes;

public class Person {

	// Atributos públicos
	public String name;
	public int age;

	// Atributos privados
	/*
		private String name;
		private int age;
	*/

	// Constructores
	public Person() {
		System.out.println("¡Hola desde el constructor del objeto <Person> sin parámetro!");
	}

	public Person(String name) {
		System.out.println("¡Hola " + name + " desde el constructor del objeto <Person> con parámetro!");
	}

	// Métodos públicos
	public void showData() {
		System.out.println("Nombre: " + name);
		System.out.println("Edad: " + age);
	}
	// Métodos privados
	/*
		private void showData() {
			System.out.println("Nombre: " + name);
			System.out.println("Edad: " + age);
		}
	*/
}
