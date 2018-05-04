package exercises;

import java.io.IOException;
import java.util.Scanner;

public class Ex1018_Cedulas {

	public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(System.in);
		int n, valor, qtdNota100 = 0, qtdNota50 = 0, qtdNota20 = 0, qtdNota10 = 0, qtdNota5 = 0, qtdNota2 = 0, 
				qtdNota1 = 0;

		//System.out.println("Informe o valor: ");
		n = input.nextInt();

		valor = n;
		qtdNota100 = n / 100;
		n %= 100;

		qtdNota50 = n / 50;
		n %= 50;

		qtdNota20 = n / 20;
		n %= 20;

		qtdNota10 = n / 10;
		n %= 10;

		qtdNota5 = n / 5;
		n %= 5;

		qtdNota2 = n / 2;
		n %= 2;

		qtdNota1 = n;

//		System.out.println(valor);
		System.out.println(qtdNota100 + " nota(s) de R$ 100,00");
		System.out.println(qtdNota50 + " nota(s) de R$ 50,00");
		System.out.println(qtdNota20 + " nota(s) de R$ 20,00");
		System.out.println(qtdNota10 + " nota(s) de R$ 10,00");
		System.out.println(qtdNota5 + " nota(s) de R$ 5,00");
		System.out.println(qtdNota2 + " nota(s) de R$ 2,00");
		System.out.println(qtdNota1 + " nota(s) de R$ 1,00");		

	}

}

//Scanner input = new Scanner(System.in);
//
//int valor;
//int qtdNota100;
//int qtdNota50;
//int qtdNota20;
//int qtdNota10;
//int qtdNota5;
//int qtdNota2;
//int qtdNota1;
//
//System.out.println("Informe o valor: ");
//valor = input.nextInt();
//System.out.println(valor);
//
//qtdNota100 = valor / 100;
//valor = valor - (qtdNota100 * 100);
//
//qtdNota50 = valor / 50;
//valor = valor - (qtdNota50 * 50);
//
//qtdNota20 = valor / 20;
//valor = valor - (qtdNota20 * 20);
//
//qtdNota10 = valor / 10;
//valor = valor - (qtdNota10 * 10);
//
//qtdNota5 = valor / 5;
//valor = valor - (qtdNota5 * 5);
//
//qtdNota2 = valor / 2;
//valor = valor - (qtdNota2 * 2);
//
//qtdNota1 = valor;
//
//System.out.println(qtdNota100 + " nota(s) de R$ 100,00");
//System.out.println(qtdNota50 + " nota(s) de R$ 50,00");
//System.out.println(qtdNota20 + " nota(s) de R$ 20,00");
//System.out.println(qtdNota10 + " nota(s) de R$ 10,00");
//System.out.println(qtdNota5 + " nota(s) de R$ 5,00");
//System.out.println(qtdNota2 + " nota(s) de R$ 2,00");
//System.out.println(qtdNota1 + " nota(s) de R$ 1,00");
