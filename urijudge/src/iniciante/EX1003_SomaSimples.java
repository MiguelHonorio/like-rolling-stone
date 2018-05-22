package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class EX1003_SomaSimples {
	public static void main(String[] args) throws IOException {

		Scanner leia = new Scanner(System.in);

		int a, b, soma;

		a = leia.nextInt();
		b = leia.nextInt();
		soma = a + b;

		System.out.println("SOMA = " + soma);

	}

}
