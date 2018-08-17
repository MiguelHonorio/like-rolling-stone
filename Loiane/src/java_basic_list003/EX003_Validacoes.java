package java_basic_list003;

import java.util.Scanner;

public class EX003_Validacoes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String nome;
		String sexo;
		String estadoCivil;
		int idade;
		double salario;

		boolean infosValidas = false;
		do {
			System.out.println("Entre com o nome: ");
			nome = scan.next();
			if (nome.length() >= 3) {
				infosValidas = true;
			} else {
				System.out.println("Nome deve conter mais do que 3 caracteres!");
			}
		} while (!infosValidas);

		infosValidas = false;
		do {
			System.out.println("Entre com a idade: ");
			idade = scan.nextInt();
			if (idade >= 0 && idade <= 150) {
				infosValidas = true;
			} else {
				System.out.println("Idade deve estar entre 0 e 150!");
			}
		} while (!infosValidas);

		infosValidas = false;
		do {
			System.out.println("Entre com o sal�rio: ");
			salario = scan.nextDouble();
			if (salario > 0) {
				infosValidas = true;
			} else {
				System.out.println("Sal�rio inv�lido, precisa ser maior que 0!");
			}
		} while (!infosValidas);

		infosValidas = false;
		do {
			System.out.println("Entre com o g�nero: ");
			sexo = scan.next();
			if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("F")
					|| sexo.equalsIgnoreCase("M")) {
				infosValidas = true;
			} else {
				System.out.println("Informe um sexo v�lido!");
			}
		} while (!infosValidas);

		infosValidas = false;
		do {
			System.out.println("Entre com o estado civil: ");
			estadoCivil = scan.next();
			if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c")
					|| estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")) {
				infosValidas = true;
			} else {
				System.out.println("Estado Civil inv�lido!");
			}
		} while (!infosValidas);
		System.out.println("As seguintes informa��es foram registradas!");
		System.out.println("Nome: " + nome);
		System.out.println("Idadde: " + idade);
		System.out.println("G�nero: " + sexo);
		System.out.println("Estado Civil: " + estadoCivil);
		System.out.println("Sal�rio: " + salario);
	}

}
