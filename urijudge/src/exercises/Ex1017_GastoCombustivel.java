package iniciante;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1017_GastoCombustivel {

	public static void main(String[] args) throws IOException{

		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.000");
		int velMedia;
		int tempoGasto;
		double kmLitro = 12;
		double totalGasto;

		tempoGasto = input.nextInt();
		velMedia = input.nextInt();

		totalGasto = (tempoGasto * velMedia) / kmLitro;
		
		System.out.println(df.format(totalGasto));

	}

}