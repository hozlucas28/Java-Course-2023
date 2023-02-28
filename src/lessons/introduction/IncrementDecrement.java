/* --------------------------------------------------------------------------
 * APUNTES:
 * 		   Los pre-incrementos se incrementan antes de la ejecución, mientras
 *		   que los post-incrementos se incrementan luego de la ejecución.
-------------------------------------------------------------------------- */

package lessons.introduction;

public class IncrementDecrement {

	public static void main(String[] args) {
		int c = 0;

		/* ----------------------------- Pre Incrementos ---------------------------- */

		++c;
		System.out.println(++c);

		--c;
		System.out.println(--c);

		/* ---------------------------- Post Incrementos ---------------------------- */

		c = 0;
		c++;
		c++;
		System.out.println(c);

		c--;
		System.out.println(c);
	}
}
