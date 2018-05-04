package iniciante;

import java.util.Scanner;

public class CodProdSwitch {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int codigo = 0;

		System.out.println("Digite o código do produto: ");
		codigo = ler.nextInt();

		switch (codigo) {
		case 1:
			System.out.println("Parafuso");
			break;
		case 2:
			System.out.println("prego");
			break;
		case 3:
			System.out.println("Porca");
			break;
		default:
			System.out.println("Produtos diversos!");
		}
	}

}
