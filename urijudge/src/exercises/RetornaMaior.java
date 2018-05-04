package exercises;

import java.util.Scanner;


public class RetornaMaior {
	
	public static void main (String []args){
		
		@SuppressWarnings("resource")
		Scanner recebe = new Scanner(System.in);
		
		int outro = 0;
		int maior = 0;
		int menor = 0;
	
		
		for(int num = 0; num < 4; num++){
			System.out.println("insira um valor: ");
			outro = recebe.nextInt();
			if(num == 0){
				maior = outro ;
				menor = outro ;
			}
			if(outro  > maior){
				maior = outro ;
			}
			if(outro  < menor){
				menor = outro ;
			}
		}
		System.out.print("Maior: "+ maior +". Menor: "+ menor);
	}
}
