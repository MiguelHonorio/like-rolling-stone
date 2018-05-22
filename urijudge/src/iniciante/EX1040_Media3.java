package iniciante;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class EX1040_Media3 {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		DecimalFormat df = new DecimalFormat("0.#");
		Scanner scan = new Scanner(System.in);
		float n1 = scan.nextFloat();
		float n2 = scan.nextFloat();
		float n3 = scan.nextFloat();
		float n4 = scan.nextFloat();
		float nExame;
		float media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;
		
		System.out.println("Media: " + df.format(media));

		if (media >= 7.0) {
			System.out.println("Aluno aprovado.");

		} else if (media < 5) {
			System.out.println("Aluno reprovado.");

		} else if (media >= 5.0 && media <= 6.9) {
			System.out.println("Aluno em exame.");

			System.out.println("Nota do exame: " + df.format(nExame = scan.nextFloat()));

			float mFinal = (nExame + media) / 2;

			if (mFinal >= 5) {
				System.out.println("Aluno aprovado.");
			} else {
				System.out.println("Aluno reprovado");
			}
			System.out.println("Media final: " + df.format(mFinal));

		}
	}
}
