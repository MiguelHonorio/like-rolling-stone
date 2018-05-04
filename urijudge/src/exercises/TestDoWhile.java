package iniciante;

import java.util.Scanner;

public class TestDoWhile {
	public static void main(String[] args) {
		
		int contatdor;
		int aux;
		int quantidade = 0;
		int num;
		int soma = 0;
		Scanner ler = new Scanner(System.in);
		
		do{
			System.out.println("Digite a quantidade de números a ser tirada a media\n");
			aux = ler.nextInt();
			quantidade++;
			if(quantidade == aux){
					System.out.println("Digite os números: ");
				num = ler.nextInt();
				soma = soma + num;

			}
		
	}while(quantidade < aux);
	
	int media = (soma / aux);
	System.out.println("A média dos numeros digitados é: " + media);
}}
