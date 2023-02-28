package lessons.introduction;

public class Operators {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/* ------------------------- Operadores Matemáticos ------------------------- */

		int a = 50;
		int b = 6;

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a / b);
		System.out.println(a % b);

		a += 10; // Igual que: a = a + 10.
		b += 5; // Igual que: b = b - 5.

		System.out.println(a);
		System.out.println(b);

		/* ------------------------- Operadores Relacionales ------------------------ */

		a = 3;
		b = 2;

		System.out.println(a == b); // Iguales.
		System.out.println(a != b); // Distintos.
		System.out.println(a >= b); // Mayor igual que <...>.
		System.out.println(a <= b); // Menor igual que <...>.

		/* --------------------------- Operadores Lógicos --------------------------- */

		System.out.println(!true); // Invierte la veracidad de la condición.
		System.out.println(true && true); // Si uno es falso => false.
		System.out.println(true || false); // Si uno es verdadero => true.
	}
}
