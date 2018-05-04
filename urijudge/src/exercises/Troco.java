package iniciante;

import java.text.NumberFormat;
import java.util.Scanner;

public class Troco {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		 NumberFormat num = NumberFormat.getCurrencyInstance();

		double valorPago = 0.00;
		double preco = 0.00;

		System.out.println("Digite o preço do produto: ");
		num.format(preco = ler.nextDouble());

		System.out.println("Digite o valor pagamento: ");
		num.format(valorPago = ler.nextDouble());

		if (valorPago < preco) {
			System.out.println("Valor insuficiente para compra, faltam: "
					+ num.format((preco - valorPago)));
		}
		if (valorPago == preco) {
			System.out.println("Não tem troco!");
		}
		if (valorPago > preco)
			System.out.println("O troco é de: " + num.format((valorPago - preco)));

	}

}
