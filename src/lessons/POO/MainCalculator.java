/* --------------------------------------------------------------------------
 * APUNTES:
 * 		   Archivo de ejecución de la clase <Calculator> definida
 *		   en <classes/Calculator.java>
-------------------------------------------------------------------------- */

package lessons.POO;

import static java.lang.Math.*; // Importa atributos/métodos, pudiendo acceder sin utilizar el ".".

import lessons.POO.classes.Calculator;

public class MainCalculator {

	public static void main(String[] args) {
		final int MyConst = 2; // Declaración de una constante.

		// Métodos estáticos de <Calculator>
		System.out.println(Calculator.PI);
		System.out.println(Calculator.add(10, 3));
		System.out.println(Calculator.add(1.1526, 3.5847));

		/*
			MyConst = 2; // Imposible modificar por ser constante.
			Calculator.PI = 1; // Imposible modificar por ser constante
		*/

		// Importaciones de <Math>
		System.out.println(PI);
		System.out.println(pow(2, 3));
	}
}
