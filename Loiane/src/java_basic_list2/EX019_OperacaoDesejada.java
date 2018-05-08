package java_basic_list2;

import java.util.Scanner;

public class EX019_OperacaoDesejada {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com o primeiro número: ");
		int num1 = scan.nextInt();
		System.out.println("Entre com o segundo número: ");
		int num2 = scan.nextInt();

		System.out.println("Qual a operaçã oque deseja realizar (* ,+ ,- ,/):");
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
			System.out.println("Operação inválida");
			valida = false;
		}

		if (valida) {
			if (resultado >= 0) {
				System.out.println(resultado + " Resultado é positivo");
			} else {
				System.out.println(resultado + " Resultado é negativo");
			}

			if (resultado % 2 == 0) {
				System.out.println(resultado + " Resultado é par");
			} else {
				System.out.println(resultado + " Resultado é impar");
			}
		}

	}

}
