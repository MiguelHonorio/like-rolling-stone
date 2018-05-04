package iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ConsumoMedio {
	
	public static void main(String[] args) throws IOException{
		
		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.ENGLISH);
		
		
		int X;
		double Y;
		
		X = input.nextInt();
		Y = input.nextDouble();
		double media = X/Y;

		System.out.printf("\n%.3f km/l\n",+media);
	}

}
