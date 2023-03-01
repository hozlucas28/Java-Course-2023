package practices.controlEstructures.checkParity;

import java.util.Scanner;

public class Parity {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int n;

		System.out.println("Ingrese un número:");
		n = read.nextInt();
		read.close();

		if (n != 0) {
			if (n > 0) {
				if (n % 2 == 0) {
					System.out.printf("El número %d es par positivo.", n);
				} else {
					System.out.printf("El número %d es impar positivo.", n);
				}
			} else {
				if (n % 2 == 0) {
					System.out.printf("El número %d es par negativo.", n);
				} else {
					System.out.printf("El número %d es impar negativo.", n);
				}
			}
		} else {
			System.out.printf("El número %d es neutro.", n);
		}
	}
}
