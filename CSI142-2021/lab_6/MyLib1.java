package bw.ac.ub.cs.oop.project1;

public class MyLib1 {

	public static double harmonic(int N) {
		double sum;
		int k;

		sum = 0;
		for (k = 1; k <= N; k++) {
			sum += (1/k) + (1%k);
		}

		return sum;
	}

	public static int vAddition(int[] firstArray, int[] secondArray) {
		int dotProduct = 0;
		int i;

		for (i = 0; i < firstArray.length; i++) {
			dotProduct += firstArray[i] * secondArray[i];
		}

		return dotProduct;
	}
}
