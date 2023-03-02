package lessons.functions;

public class MyStrings {

	public static void main(String[] args) {
		System.out.println("¡Hola Mundo!".charAt(2)); // Obtengo un carácter en base a al índice.
		System.out.println("¡Hola Mundo!".length()); // Obtengo la cantidad de caracteres (longitud).
		System.out.println("¡Hola Mundo!".substring(0, 5)); // Obtengo un trozo de caracteres desde param1 a param2.

		// Transformaciones
		System.out.println("¡Hola Mundo!".toLowerCase()); // A minúsculas.
		System.out.println("¡Hola Mundo!".toUpperCase()); // A mayúsculas.
		System.out.println("¡Hola Mundo!".replace("Mundo", "Java")); // Remplazo param1 por param2 en el cadena de caracteres original.

		System.out.println("Lucas".equals("Nahuel")); // Comparo dos <strings>.
	}
}
