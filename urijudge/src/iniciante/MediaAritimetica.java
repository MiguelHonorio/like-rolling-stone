package iniciante;

import java.util.Scanner;

public class MediaAritimetica {
	public static void main(String[] args) {

		int num = 0;
		int quantidade = 0;
		float media = 0;
		int aux = 0;
		float soma = 0;
		Scanner ler = new Scanner(System.in);

		System.out
				.println("Digite a quantidade de n�meros a ser tirada a media\n");
		aux = ler.nextInt();
		while (quantidade < aux) {
			quantidade++;
			System.out.println("Digite os n�meros: ");
			num = ler.nextInt();
			soma = soma + num;

		}
		media = (soma / aux);
		System.out.println("A m�dia dos numeros digitados �: " + media);

	}

}
