package java_basic_list002;

import java.util.Scanner;

public class EX014_MediaSemestralAluno {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com a primeira nota:");
		double nota1 = scan.nextDouble();
		System.out.println("Entre com a segunda nota:");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2)/2;
		
		String aproveitamento = "";
		if(media >= 9.0 && media <= 10.0) {
			aproveitamento = "A";
		}else if(media >= 7.5 && media < 9.0) {
			aproveitamento = "B";
		}else if(media >= 6.0 && media < 7.5) {
			aproveitamento = "C";
		}else if(media >= 4.0 && media < 6.0) {
			aproveitamento = "D";
		}if(media >= 0.0 && media < 4.0) {
			aproveitamento = "E";
		}

		System.out.println("Nota1: " +nota1);
		System.out.println("Nota1: " +nota2);
		System.out.println("M�dia: " +media);
		System.out.println("Conceito:" +aproveitamento);
		
		switch(aproveitamento) {
		case "A":
		case "B":
		case "C":
			System.out.println("Aprovado");break;
		case "D":
		case "E":
			System.out.println("Reprovado");
		}
	}

}
