package practices.controlEstructures.generateTable;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int n, c;

		System.out.println("Ingrese un número:");
		n = read.nextInt();
		read.close();

		c = 0;
		while (c <= 10) {
			System.out.printf("%d x %d = %d\n", n, c, n * c);
			c++;
		}
	}
}
