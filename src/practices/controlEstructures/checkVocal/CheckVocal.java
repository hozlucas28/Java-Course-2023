package practices.controlEstructures.checkVocal;

import java.util.Scanner;

public class CheckVocal {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		char c;

		System.out.println("Ingrese una letra en mayúsculas:");
		c = read.next().charAt(0);
		read.close();

		switch (c) {
			case 'A':
				System.out.printf("La letra %s es vocal.", c);
				break;
			case 'E':
				System.out.printf("La letra %s es vocal.", c);
				break;
			case 'I':
				System.out.printf("La letra %s es vocal.", c);
				break;
			case 'O':
				System.out.printf("La letra %s es vocal.", c);
				break;
			case 'U':
				System.out.printf("La letra %s es vocal.", c);
				break;
			default:
				System.out.printf("La letra %s no es vocal.", c);
		}
	}
}
