package java_basic_list003;

public class EX013_CalculoExpoente {

	public static void main(String[] args) {
		
		int numBase = 2;
		int numPotencia = 3;
		
		int resultado = numBase;
		
		for(int i=1; i< numPotencia; i++){
			resultado *= numBase; 
		}
		System.out.println(resultado);
		
	}

}
