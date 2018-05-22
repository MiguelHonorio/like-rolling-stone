package java_basic_list002;

import java.util.Scanner;

public class Ex008_ProdutoMaisBarato {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Product one: ");
		double one = scan.nextDouble();
		System.out.println("Product two: ");
		double two = scan.nextDouble();
		System.out.println("Product three: ");
		double three = scan.nextDouble();

		if (one <= two && one <= three) {
			System.out.println("You should buy the product  one");
		}
		if (two <= one && two <= three) {
			System.out.println("You should buy the product two");
		} else if (three <= one && three <= two) {
			System.out.println("You should buy the product three");
		}

	}

}
