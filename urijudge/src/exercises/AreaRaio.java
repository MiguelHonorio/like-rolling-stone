package exercises;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class AreaRaio {
	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);

		// Modo 1 de declarar o inputStream
		// InputStreamReader ir = new InputStreamReader(System.in);
		// BufferedReader in = new BufferedReader(ir);

		// Modo 2 mais eficaz de declarar o inputStream dentro do Buffrered
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		double raio;
		raio = Float.parseFloat(in.readLine());
		System.out.printf("A=%.4f%n", raio*raio*3.14159);
		
		
//		Locale.setDefault(Locale.US); 
//        Scanner leitor = new Scanner(System.in);
//        double A, raio;
//        raio = leitor.nextDouble();
//        A = (raio*raio) * 3.14159;
//        System.out.printf("A=%.4f\n",A);

		

	}
}
