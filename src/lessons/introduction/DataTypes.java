package lessons.introduction;

public class DataTypes {

	public static void main(String[] args) {
		/* ---------------------------- Datos Primitivos ---------------------------- */

		// Almacenan números enteros
		byte myByte = 25;
		short myShort = 25;
		int myInt = 25;
		long myLong = 25L;

		// Almacenan números decimales
		float myFloat = 245.45F;
		double myDouble = 245.4578215F;

		char myChar = 64; // Almacena caracteres (entre comillas simples obligatoriamente) ó código ASCII.
		boolean myBoolean = true; // Almacena true ó false.

		System.out.println(myByte);
		System.out.println(myShort);
		System.out.println(myInt);
		System.out.println(myLong);

		System.out.println(myFloat);
		System.out.println(myDouble);

		System.out.println(myChar);
		System.out.println(myBoolean);
	}
}
