package java_basic_list003;

public class EX015_Fibonacci {

	public static void main(String[] args) {

		int pNum = 1;
		int sNum = 1;
		int proximo;
		System.out.println("Sequência Fibonacci: " +pNum);
		System.out.println("Sequência Fibonacci: " +sNum);
		for (int i = 3; i <= 10; i++) {
			proximo = pNum + sNum;
			pNum = sNum;
			sNum = proximo;
			System.out.println("Sequência Fibonacci: " + proximo);
		}
	}

}
