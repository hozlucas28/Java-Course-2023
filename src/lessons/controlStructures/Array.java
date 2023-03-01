package lessons.controlStructures;

public class Array {

	public static void main(String[] args) {
		// Inicialización de un arreglo
		String name[]; // <array> de <string>.
		name = new String[3]; // Tamaño (cantidad de elementos).

		// Definición de sus elementos
		name[0] = "Lucas";
		name[1] = "Nahuel";
		name[2] = "Marcos";

		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}

		// Inicialización de un arreglo con elementos ya definidos
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
}
