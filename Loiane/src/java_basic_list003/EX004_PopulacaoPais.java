package java_basic_list003;

public class EX004_PopulacaoPais {

	public static void main(String[] args) {

		double populA = 80000; // taxa de crescimento 3%
		double populB = 200000; // taxa de crescimento 1.5%
		double count = 0;

		while (populA < populB) {
			populA += (populA / 100) * 3;
			populB += (populB / 100) * 1.5;
			count++;
		}
		System.out.println("Popula��o A: " + populA);
		System.out.println("Popula��o B: " + populB);
		System.out.println("Em " + count + " anos popula��o 'A' ir� alcan�ar popula��o 'B'");

	}

}
