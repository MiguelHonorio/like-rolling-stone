package java_basic_list003;

public class EX009_ImprimaImpar {

	public static void main(String[] args) {

		System.out.println("Os n�meros a seguir s�o �mpares!");
		for (int i = 0; i <= 50; i++) {
			if (i % 2 != 0) {
				System.out.print(i);
				if (i < 49 ) {
					System.out.print(",");
				}
			}
		}
	}
}