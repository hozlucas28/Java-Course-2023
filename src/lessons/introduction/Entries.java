package lessons.introduction;

import java.util.Scanner;

public class Entries {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in); // Iniciar entrada.

		System.out.println("Ingrese su nombre:");
		String name = read.nextLine();

		System.out.println("Ingrese su edad:");
		int age = read.nextInt();

		System.out.println("Ingrese un cáracter:");
		char charater = read.next().charAt(0);

		System.out.printf("Entradas: %s | %d | %c", name, age, charater);
		read.close(); // Cerrar entrada.
	}
}
