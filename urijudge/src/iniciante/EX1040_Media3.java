package iniciante;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class EX1040_Media3 {

	public static void main(String[] args) throws IOException {

		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";

		Scanner scan = new Scanner(System.in);

		int i2 = scan.nextInt();
		double d2 = scan.nextDouble();
		String s2 = scan.nextLine();
		s2 = scan.nextLine();

		System.out.println(i + i2);
		System.out.println(d + d2);
		System.out.println(s + s2);

		scan.close();
	}
}
