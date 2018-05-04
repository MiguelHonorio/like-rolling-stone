package exercises;

import java.text.NumberFormat;
import java.util.Scanner;

public class KgProduto {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		NumberFormat num = NumberFormat.getCurrencyInstance();

		double precoKG;
		double quantidade;

		System.out.println("Digite o preço/KG do produto: ");
		num.format(precoKG = ler.nextDouble());

		System.out.println("Digite a quantidade de kg comprado: ");
		num.format(quantidade = ler.nextDouble());

		System.out.println("Valor total a ser pago é: " + num.format((precoKG * quantidade)));

	}

}