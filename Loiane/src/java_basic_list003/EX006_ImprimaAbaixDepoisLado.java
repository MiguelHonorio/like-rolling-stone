package java_basic_list003;

import java.util.Locale;
import java.util.Scanner;

public class EX006_ImprimaAbaixDepoisLado {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		for (int num = 0; num <= 20; num++) {

			System.out.print(num+" ; ");

		}

		// while(num < 20 ){
		// num++;
		//um abaixo do outro
		// System.out.println(num);
		// }
	}

}
