package lessons.controlStructures;

public class Matrix {

	public static void main(String[] args) {
		// Inicialización de una matriz
		int[][] m = new int[2][3]; // [<ROW>][<COLUMN>].

		// Definición de los elementos de la fila 1
		m[0][0] = 1; // Columna 1.
		m[0][1] = 2; // Columna 2.
		m[0][2] = 3; // Columna 3.

		// Definición de los elementos de la fila 2
		m[1][0] = 4; // Columna 1.
		m[1][1] = 5; // Columna 2.
		m[1][2] = 6; // Columna 3.

		int i = 1;
		for (int[] row : m) { // Recorro la fila número <row>.
			System.out.printf("\nFila %d:", i);
			for (int column : row) { // Recorro los elementos de fila número <row>.
				System.out.printf(" %d", column);
			}

			i++;
		}

		// Inicialización de una matriz con elementos ya definidos
		int[][] n = {
			{ 1, 2, 3 }, // Fila 1.
			{ 4, 5, 6 } // Fila 2.
		};

		i = 1;
		for (int[] row : n) {
			System.out.printf("\nFila %d:", i);
			for (int column : row) {
				System.out.printf(" %d", column);
			}

			i++;
		}
	}
}
