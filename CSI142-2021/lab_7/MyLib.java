package bw.ac.ub.cs.oop.project2;

public class MyLib {
	
	public static double altSeries(int N) {
		int k;
		double sum, cal;
		
		sum = 0;
		
		for (k = 4; k <= N; k++) {
			cal = (Math.pow(-1, k - 1)) * (1 / Math.sqrt(k - 3));
			sum += cal;
		}
		
		return sum;
	}
	
	public static boolean isSorted(int[] intArray) {
		int i;
		boolean sortedDesc = true; // assuming array is in descending order.
		
		for (i = 0; i < intArray.length - 1; i++) {
			if (intArray[i] < intArray[i + 1]) {
				sortedDesc = false;
			}
		}
		
		return sortedDesc;
	}
	
	public static String[] fizzArray(int N) {
		String[] numStrings = new String[N];
		
		int nums, i;
		nums = N - 1;
		
		for (i = 0; i < numStrings.length; i++) {
			numStrings[i] = Integer.toString(nums);
			nums--;
		}
		
		return numStrings;		
	}
	
}
