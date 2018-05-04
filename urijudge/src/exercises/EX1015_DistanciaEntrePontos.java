package iniciante;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class EX1015_DistanciaEntrePontos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0000");

		double x1, y1, x2, y2, distancia;

		x1 = input.nextDouble();
		y1 = input.nextDouble();
		x2 = input.nextDouble();
		y2 = input.nextDouble();

		//Math.sqrt raiz quadrada
		distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

		System.out.println(df.format(distancia));
	}

}
