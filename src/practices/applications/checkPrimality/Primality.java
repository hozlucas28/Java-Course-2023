package practices.applications.checkPrimality;

import java.util.Scanner;

public class Primality {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int n = 0;
		String message;

		do {
			System.out.println("Ingrese un número positivo (distinto a cero):");
			n = read.nextInt();

			message = (n <= 0) ? "¡Error! Ingrese un número positivo distinto a cero. Vuelva a intentar..." : "";
			System.out.println(message);
		} while (n <= 0);
		read.close();

		message = (isPrimeNumber(n)) ? "es primo." : "no es primo.";
		System.out.printf("El número %d %s\n", n, message);
	}

	public static boolean isPrimeNumber(int n) {
		int c = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				c++;
			}
		}

		return n == 1 || c == 2;
	}
}
