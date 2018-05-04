package iniciante;

import java.util.Scanner;




public class MaiorMenor {
	
	public static void main (String []args){
		
		@SuppressWarnings("resource")
		Scanner variavel = new Scanner(System.in);
		int num = 0;
		int maior = 0;
		int menor = 0;
		
		System.out.println("insira um valor: ");
		num = variavel.nextInt();
		
		if(num == 0){
			maior = num;
			menor = num;
		}
		if(num > maior){
			maior = num;
		}
		if(num < menor){
			menor = num;
		}
		System.out.println("Maior: "+ maior +". Menor: "+ menor);
	}
}
