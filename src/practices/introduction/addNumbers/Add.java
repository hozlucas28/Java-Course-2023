package practices.introduction.addNumbers;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int a, b, result;

		System.out.println("Ingrese el primer número:");
		a = read.nextInt();

		System.out.println("Ingrese el segundo número:");
		b = read.nextInt();
		read.close();

		result = a + b;
		System.out.printf("La suma de %d + %d = %d.", a, b, result);
	}
}
