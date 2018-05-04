package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Ex1021_CedulasMoedas {

	public static void main(String[] args) throws IOException {

		Scanner input = new Scanner(System.in);
		float n, valor, qtdNota100 = 0, qtdNota50 = 0, qtdNota20 = 0, qtdNota10 = 0, qtdNota5 = 0, qtdNota2 = 0;

		float qtdMoeda1 = 0.0f, qtdMoeda50 = 0.0f, qtdMoeda25 = 0.0f, qtdMoeda10 = 0.0f, qtdMoeda05 = 0.0f,
				qtdMoeda01 = 0.0f;

		// System.out.println("Informe o valor: ");
		n = input.nextFloat();

		valor = n;
		qtdNota100 = n / 100;
		n %= 100;

		qtdNota50 = n / 50;
		n %= 50;

		qtdNota20 = n / 20;
		n %= 20;

		qtdNota10 = n / 10;
		n %= 10;

		qtdNota5 = n / 5;
		n %= 5;

		qtdNota2 = n / 2;
		n %= 2;

//		
//		qtdMoeda1 = n / 100;
//		n %= 100;
//		
//		qtdMoeda50 = n / 50;
//		n %= 50;
//
//		qtdMoeda25 = n / 25;
//		n %= 25;
//
//		qtdMoeda10 = n / 10;
//		n %= 10;
//
//		qtdMoeda05 = n / 05;
//		n %= 05;
//
//		qtdMoeda01 = n / 01;
//		n %= 01;

		
		System.out.println("NOTAS:");
		System.out.println(valor);
		System.out.println(qtdNota100 + " nota(s) de R$ 100.00");
		System.out.println(qtdNota50 + " nota(s) de R$ 50.00");
		System.out.println(qtdNota20 + " nota(s) de R$ 20.00");
		System.out.println(qtdNota10 + " nota(s) de R$ 10.00");
		System.out.println(qtdNota5 + " nota(s) de R$ 5.00");
		System.out.println(qtdNota2 + " nota(s) de R$ 2.00");

		System.out.println("MOEDAS:");
		System.out.println(qtdMoeda1 + " moeda(s) de R$ 1.00");
		System.out.println(qtdMoeda50 + " moeda(s) de R$ 0.50");
		System.out.println(qtdMoeda25 + " moeda(s) de R$ 0.25");
		System.out.println(qtdMoeda10 + " moeda(s) de R$ 0.10");
		System.out.println(qtdMoeda05 + " moeda(s) de R$ 0.05");
		System.out.println(qtdMoeda01 + " moeda(s) de R$ 0.01");

	}
}
