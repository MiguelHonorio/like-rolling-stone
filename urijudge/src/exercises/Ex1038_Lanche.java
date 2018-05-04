package exercises;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Ex1038_Lanche {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int codItem = scan.nextInt();
		int qtdItem = scan.nextInt();
		float preco = 0;

		if (codItem == 1) {
			preco = (float) (4.00 * qtdItem);

		}
		if (codItem == 2) {
			preco = (float) (4.50 * qtdItem);

		}
		if (codItem == 3) {
			preco = (float) (5.00 * qtdItem);

		}
		if (codItem == 4) {
			preco = (float) (2.00 * qtdItem);

		}
		if (codItem == 5) {
			preco = (float) (1.50 * qtdItem);

		}
		System.out.printf("Total: R$ %.2f\n", preco);

	}

}
