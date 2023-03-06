/* --------------------------------------------------------------------------
 * APUNTES:
 * 		   Ejemplo de la captura de una excepción personalizada.
 *
 *
 * IMPORTANTE:
 *  			  - <finally> = Ejecuta un bloque de código, sin importar si se ha
 *								ocurrido una excepción ó no.
 *  			  - <throw new> = Instrucción necesaria para lanzar una excepción
 *								  que pueda ser capturada por el <catch>.
-------------------------------------------------------------------------- */

package lessons.exceptions;

import java.util.Scanner;

public class CustomException {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int n1, n2, result;

		try {
			System.out.println("Ingrese un número:");
			n1 = read.nextInt();

			System.out.println("Ingrese otro número:");
			n2 = read.nextInt();

			result = divide(n1, n2);
			System.out.println(result);
		} catch (DividerException e) {
			System.err.println("¡Error!" + e.getMessage());
			e.printStackTrace(System.out);
		} catch (Exception e) {
			System.err.println("¡Ha ocurrido un error!");
			e.printStackTrace(System.out);
		} finally {
			System.out.println("¡Se ha ejecutado el bloque de código de <finally>!");
		}
	}

	private static int divide(int n1, int n2) {
		if (n2 == 0) {
			throw new DividerException("No se puede dividir por cero.");
		}

		return n1 / n2;
	}
}
