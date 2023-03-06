/* --------------------------------------------------------------------------
 * APUNTES:
 * 		   Las excepciones me permiten capturar e informar posibles errores
 *		   ocurridos durante la ejecución del programa, errores que no fueron
 *		   detectadas por el IDE.
 *
 *
 * IMPORTANTE:
 *  			  - <try> = Envuelve el código a ejecutar que pueda llegar a
 *							lanzar una excepción, en caso de ocurrir, se procede
 *							al <catch> correspondiente.
 *  			  - <catch> = Captura la excepción ocurrida, ejecutando un bloque
 *							  de código.
-------------------------------------------------------------------------- */

package lessons.exceptions;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int n1, n2, result;

		try {
			System.out.println("Ingrese un número:");
			n1 = read.nextInt();

			System.out.println("Ingrese otro número:");
			n2 = read.nextInt();

			result = n1 / n2;
			System.out.println(result);
		} catch (Exception e) {
			System.err.println("¡Ha ocurrido un error!");
			e.printStackTrace(System.out);
		}
	}
}
