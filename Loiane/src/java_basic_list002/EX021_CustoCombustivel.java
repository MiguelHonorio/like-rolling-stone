package java_basic_list002;

import java.util.Scanner;

public class EX021_CustoCombustivel {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com quantidade de combustível: ");
		long litros = scan.nextLong();
		System.out.println("Qual o tipo  de combustível: ");
		String tipo = scan.next();

		double precoAl = 1.90;
		double precoGas = 2.90;
		int percentual = 0;
		double total = 0;
		double totalDesc = 0;

		if (tipo.equalsIgnoreCase("a")) {
			if (litros <= 20) {
				percentual = 3;
			} else {
				percentual = 5;
			}
			total = litros * precoAl;
		} else if (tipo.equalsIgnoreCase("g")) {
			if (litros <= 20) {
				percentual = 4;
			} else {
				percentual = 5;
			}
			total = litros * precoGas;
		}

		totalDesc = (total / 100) * percentual;
		double precoApagar = total - totalDesc;
		System.out.println("valor a ser pago: " + precoApagar);
	}

}
