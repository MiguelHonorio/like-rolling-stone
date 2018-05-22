package iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class MaiorDeTres {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int A, B, C, maior1, maior2;

		A = input.nextInt();
		B = input.nextInt();
		C = input.nextInt();

		maior1 = (A + B + Math.abs(A - B)) / 2;

		maior2 = (maior1 + C + Math.abs(maior1 - C)) / 2;
		
		System.out.printf(maior2+" eh o maior\n"); 

	}
}
