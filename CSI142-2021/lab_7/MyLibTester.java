package bw.ac.ub.cs.oop.project2;

import java.util.Arrays;

public class MyLibTester {

	public static void main(String[] args) {
		
		/* Alt series. */
		System.out.printf("Alt series:\n\t10: %.6f\n\t100: %.6f\n\t1000: %.6f\n\t10000: %.6f\n\t100000: %.6f\n\n", 
				MyLib.altSeries(10), MyLib.altSeries(100), 
				MyLib.altSeries(1000), MyLib.altSeries(10000), MyLib.altSeries(100000));
		
		/* Is sorted. */
		int[] firstArray = {1, 3, 5, 20, 45};
		int[] secondArray = {5, 4, 3, 2, 1};
		int[] thirdArray = {-1, 2, 3, 5, 6, 2};
		
		System.out.printf("Is sorted in descending order:\n\t%s: %b\n\t%s: %b\n\t%s: %b\n\n", 
				Arrays.toString(firstArray), MyLib.isSorted(firstArray), 
				Arrays.toString(secondArray), MyLib.isSorted(secondArray), 
				Arrays.toString(thirdArray), MyLib.isSorted(thirdArray));
		
		/* Fizz array. */
		System.out.printf("Fizz Array:\n\t6: %s\n\t13: %s\n\n", 
				Arrays.toString(MyLib.fizzArray(6)), Arrays.toString(MyLib.fizzArray(13)));

	}

}
