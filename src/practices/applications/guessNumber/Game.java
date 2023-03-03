package practices.applications.guessNumber;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		startGame();
	}

	// Iniciar juego
	public static void startGame() {
		switch (setDifficulty()) {
			case 1:
				playGame(10);
				break;
			case 2:
				playGame(7);
				break;
			case 3:
				playGame(5);
				break;
			default:
				System.out.println("¡Juego cerrado con éxito!");
		}
	}

	// Seleccionar dificultad
	public static int setDifficulty() {
		Scanner read = new Scanner(System.in);
		int d;

		do {
			System.out.printf("Seleccione una dificultad:\n1 - Facil\n2 - Intermedio\n3 - Dificil\n4 - Salir\n");
			d = read.nextInt();

			if (!checkDifficulty(d)) {
				System.out.println("¡Error! La opción seleccionada es invalida. Vuelva a intentar...");
			}
		} while (!checkDifficulty(d));
		return d;
	}

	// Comprobar que la opción de dificultad selecciona sea la correcta
	public static boolean checkDifficulty(int d) {
		return d == 1 || d == 2 || d == 3 || d == 4;
	}

	// Empezar a jugar
	public static void playGame(int lifes) {
		Scanner read = new Scanner(System.in);
		int number, rndNumber;

		rndNumber = (int) (Math.random() * 101);

		do {
			System.out.printf("Ingrese un número entre 1 y 100: ");
			number = read.nextInt();

			if (number != rndNumber) {
				lifes--;
				showHint(number, rndNumber);
				showRemainingLifes(lifes);
			}
		} while (lifes > 0 && number != rndNumber);
		read.close();

		showEndMessage(number, rndNumber);
	}

	// Mostrar consejo
	public static void showHint(int n, int rndN) {
		String message = (n < rndN) ? "El número es más grande." : "El número es más pequeño.";
		System.out.println("[!] " + message);
	}

	// Mostrar vidas restantes
	public static void showRemainingLifes(int lifes) {
		System.out.println("-------------------------");
		System.out.printf("|   %d VIDAS RESTANTES   |\n", lifes);
		System.out.println("-------------------------");
	}

	// Mostrar ultimo mensaje
	public static void showEndMessage(int n, int rndN) {
		if (n == rndN) {
			System.out.println("------------------------------------");
			System.out.println("|      FELICIDADES HAS GANADO      |");
			System.out.println("------------------------------------");
		} else {
			System.out.println("-------------------------");
			System.out.println("|       GAME OVER       |");
			System.out.println("-------------------------");
		}
	}
}
