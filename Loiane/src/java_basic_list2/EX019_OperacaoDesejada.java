package java_basic_list2;

import java.util.Scanner;

public class EX019_OperacaoDesejada {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com o primeiro n�mero: ");
		int num1 = scan.nextInt();
		System.out.println("Entre com o segundo n�mero: ");
		int num2 = scan.nextInt();

		System.out.println("Qual a opera�� oque deseja realizar (* ,+ ,- ,/):");
		String operacao = scan.next();
		double resultado = 0;
		boolean valida = true;

		switch (operacao) {
		case "+":
			resultado = num1 + num2;
			break;
		case "-":
			resultado = num1 - num2;
			break;
		case "*":
			resultado = num1 * num2;
			break;
		case "/":
			resultado = num1 / num2;
			break;
		default:
			System.out.println("Opera��o inv�lida");
			valida = false;
		}

		if (valida) {
			if (resultado >= 0) {
				System.out.println(resultado + " Resultado � positivo");
			} else {
				System.out.println(resultado + " Resultado � negativo");
			}

			if (resultado % 2 == 0) {
				System.out.println(resultado + " Resultado � par");
			} else {
				System.out.println(resultado + " Resultado � impar");
			}
		}

	}

}
