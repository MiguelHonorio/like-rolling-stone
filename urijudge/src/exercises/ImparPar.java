package exercises;

import java.util.Scanner;

public class ImparPar {
	
	public static void main (String []args){
		
		@SuppressWarnings("resource")
		Scanner recebe = new Scanner(System.in);
		
		int numero;
		
		for (int num = 0; num < 10; num++){
			System.out.println("Insira um valor qualquer: ");
			numero = recebe.nextInt();
			
			 if((numero  % 2) == 0)  
		         System.out.println(numero+" é Par");
		      else 
		         System.out.println(numero+" é Impar");
		}
				
	}

}
