/* --------------------------------------------------------------------------
 * APUNTES:
 * 		   Ejemplo de una clase padre.
 *
 *
 * IMPORTANTE:
 *  			  - <protected> = Permite que el atributo/método pueda ser
 *								  accedido desde la misma clase o por sus hijas.
 *  			  - <equals> = Me permite comparar si dos objetos son iguales.
 *  			  - <hashCode> = Devuelve un número con el objetivo de comparar
 *								 dos objetos. Si devuelve el mismo número los
 *								 objetos son iguales.
-------------------------------------------------------------------------- */

package lessons.inheritance;

import java.util.Objects;

public class Person {

	// Atributos
	protected String name;
	protected char gender;
	protected int age;
	protected String address;

	// Constructores
	public Person() {}

	public Person(String name) {
		this.name = name;
	}

	public Person(String name, char gender, int age, String address) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.address = address;
	}

	// Getters
	public String getName() {
		return this.name;
	}

	public char getGender() {
		return this.gender;
	}

	public int getAge() {
		return this.age;
	}

	public String getAddress() {
		return this.address;
	}

	// Setters
	public void setName(String name) {
		this.name = name;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	// Métodos
	public String getData() {
		return "Nombre: %s | Edad: %d".formatted(this.name, this.age);
	}

	// toString
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [name=");
		builder.append(this.name);
		builder.append(", gender=");
		builder.append(this.gender);
		builder.append(", age=");
		builder.append(this.age);
		builder.append(", address=");
		builder.append(this.address);
		builder.append("]");
		return builder.toString();
	}

	// hashCode
	public int hashCode() {
		return Objects.hash(address, age, gender, name);
	}

	// equals
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Person other = (Person) obj;

		return (
			Objects.equals(address, other.address) &&
			age == other.age &&
			gender == other.gender &&
			Objects.equals(name, other.name)
		);
	}
}
