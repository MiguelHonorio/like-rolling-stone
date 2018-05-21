package java_basic_list2;

import java.util.Scanner;

public class EX022_QtdeKgMorangoMacas {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Ente com a quantidade de Morango: ");
		double qtdMorango = scan.nextDouble();
		System.out.println("Entre com a quantidade(kg) de maça: ");
		double qtdMaca = scan.nextDouble();

		double precoMorango = 0;
		if (qtdMorango <= 5) {
			precoMorango = 2.5;
		} else {
			precoMorango = 2.2;
		}

		double precoMaca = 0;
		if (qtdMaca <= 5) {
			precoMaca = 1.8;
		} else {
			precoMaca = 1.5;
		}

		double precoTotalMorango = qtdMorango * precoMorango;
		double precoTotalMaca = qtdMaca * precoMaca;
		double precoParcial = precoTotalMorango + precoTotalMaca;
		double precoTotal = precoParcial;

		if (qtdMorango + qtdMaca > 8 || precoParcial > 25) {
			precoTotal = precoParcial - ((precoParcial / 100) * 10);
		}

		System.out.println("O valor total a ser pago é : " + precoTotal);
	}
}
