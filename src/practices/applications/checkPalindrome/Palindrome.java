package practices.applications.checkPalindrome;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String word, message;

		System.out.println("Ingrese una palabra:");
		word = read.nextLine();
		read.close();

		message = checkPalindrome(word) ? "es palíndroma." : "no es palíndroma.";
		System.out.printf("La palabra %s %s\n", word, message);
	}

	public static boolean checkPalindrome(String word) {
		StringBuilder bs = new StringBuilder();
		word = word.trim().replaceAll(" ", "");

		for (int i = word.length() - 1; i >= 0; i--) {
			bs.append(word.charAt(i));
		}
		return word.equalsIgnoreCase(bs.toString());
	}
}
