package practices.introduction.productPrice;

import java.util.Scanner;

public class ProductPrice {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double initialSP, endSP, igv;

		System.out.println("Ingrese el precio de venta:");
		initialSP = read.nextDouble();
		read.close();

		igv = initialSP * 0.18; // 0.18%
		endSP = initialSP + igv;

		System.out.println("Precio de venta (inicial): " + initialSP);
		System.out.println("IGV: " + igv);
		System.out.println("Precio de venta (final): " + endSP);
	}
}
