package java_basic_list002;

import java.util.Scanner;

public class Ex005_MediaAluno {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Nota 1 = ");
		double nota1 = scan.nextDouble();
		System.out.println("Nota 2 = ");
		double nota2 = scan.nextDouble();

		double media = (nota1 + nota2) / 2;
		if(media == 10){
			System.out.println("Aprovado com distinção!");
		}else if(media >= 7){
			System.out.println("Aprovado");
		}else{
			System.out.println("Reprovado");
		}
	}

}
