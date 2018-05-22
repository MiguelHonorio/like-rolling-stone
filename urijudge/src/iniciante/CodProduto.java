package iniciante;

import java.util.Scanner;

public class CodProduto {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		
		int codigo;
		
		System.out.println("Digite o código do produto: ");
		codigo = ler.nextInt();
		
		if (codigo == 01 && codigo!=0){
			System.out.println("Parafuso\n");
		}else if(codigo == 02){
			System.out.println("Porca\n");
		}else if(codigo == 03){
			System.out.println("Prego\n");
		}if(codigo!=01 && codigo!=02 && codigo!=03){
			System.out.println("Diversos!");
		}
	}
}
