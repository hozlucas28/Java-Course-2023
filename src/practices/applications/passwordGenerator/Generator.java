package practices.applications.passwordGenerator;

import java.util.Scanner;

public class Generator {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int nCharacters;
		String password;

		System.out.println("Ingrese la cantidad de caracteres de la contraseña a generar:");
		nCharacters = read.nextInt();
		read.close();

		password = generatePassword(nCharacters);
		System.out.printf("La contraseña generada es: %s\n", password);
	}

	public static String generatePassword(int nCharacters) {
		StringBuilder sb = new StringBuilder(), password = new StringBuilder();
		char[] numbers = { '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		char[] lowerCases = {
			'a',
			'b',
			'c',
			'd',
			'e',
			'f',
			'g',
			'h',
			'i',
			'j',
			'k',
			'l',
			'm',
			'l',
			'ñ',
			'o',
			'p',
			'q',
			'r',
			's',
			't',
			'u',
			'v',
			'w',
			'x',
			'y',
			'z'
		};
		char[] upperCases = {
			'A',
			'B',
			'C',
			'D',
			'E',
			'F',
			'G',
			'H',
			'I',
			'J',
			'K',
			'L',
			'M',
			'L',
			'Ñ',
			'O',
			'P',
			'Q',
			'R',
			'S',
			'T',
			'U',
			'V',
			'W',
			'X',
			'Y',
			'Z'
		};
		char[] specialCharaters = { '°', '!', '"', '#', '$', '%', '&', '/', '(', ')', '=', '?', '¡' };

		sb.append(numbers);
		sb.append(lowerCases);
		sb.append(upperCases);
		sb.append(specialCharaters);

		int rndNumber;
		for (int i = 0; i < nCharacters; i++) {
			rndNumber = (int) (Math.random() * sb.length());
			password.append(sb.charAt(rndNumber));
		}

		return nCharacters > 0 ? password.toString() : "";
	}
}
