package bw.ac.ub.cs.oop.project1;

import java.util.Arrays;

public class MyLib1Tester {

	public static void main(String[] args) {
		System.out.printf("Harmonic for:\n- 10 is %.2f\n- 100 is %.2f\n- 1000 is %.2f\n- 10000 is %.2f\n", 
				MyLib1.harmonic(10), MyLib1.harmonic(100), MyLib1.harmonic(1000), MyLib1.harmonic(10000));
		
		int[] arrayOne = {1, 2, 3, 4, 5};
		int[] arrayTwo = {-1, 1, -1, 1, -1};
		
		System.out.printf("\n\nThe dot product of %s and %s is:\n\t%d\n", 
				Arrays.toString(arrayOne), Arrays.toString(arrayTwo), MyLib1.vAddition(arrayOne, arrayTwo));

	}

}
