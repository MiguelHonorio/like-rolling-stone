package exercises;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solu��o execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su soluci�n ejecutar
 */
public class ConsumoMedioDois {

	public static void main(String[] args) throws IOException {

		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.ENGLISH);

		int X;
		double Y;

		X = input.nextInt();
		Y = input.nextDouble();

		double calcMedia = X / Y;

		System.out.printf("%.3f km/l\n", calcMedia);
	}

}