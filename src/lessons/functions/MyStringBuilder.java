/* --------------------------------------------------------------------------
 * APUNTES:
 * 		   El <StringBuilder> es un <string> mutable de tipo objeto.
-------------------------------------------------------------------------- */

package lessons.functions;

public class MyStringBuilder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		System.out.println(sb);

		sb.append("Lucas");
		System.out.println(sb);

		sb.append("Nahuel");
		System.out.println(sb);
	}
}
