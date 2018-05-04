package exercises;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Ex1009_Salario {
 
    public static void main(String[] args) throws IOException {
 
		Scanner leia = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		String name;
		double salFixo, vendas;
		
		name = leia.next();
		salFixo = leia.nextFloat();
		vendas = leia.nextFloat();
		
		double total = ((vendas*0.15)+ salFixo);
		System.out.printf("TOTAL = R$ %.2f%n", total);
 
    }
 
}