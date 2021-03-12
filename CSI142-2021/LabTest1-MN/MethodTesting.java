/**
 * This is the work of Ephraim Pillar.
 */

import java.util.Arrays;    // In order to use Arrays.toString() method
import java.util.Scanner;

public class MethodTesting {
    public static void main(String[] args) {
        
        /* Declaring variables */

        int i, n; 
        double cal;

        /* Creating objects */

        Monday t = new Monday();
        Scanner k = new Scanner(System.in); 

        /*
         * Roll dice
         */

        int[] dice = new int[15];

        for (i = 0; i < (dice.length); i++) {
            dice[i] = Monday.rollDice(2);
        }

        System.out.printf("\n%s\n", Arrays.toString(dice));

        /*
         * Card deck
         */

        for (i = 1; i <= 5; System.out.printf("\n%s\n", Monday.chooseCards())) {
            i++;
        }

        /*
         * Mersenne Primes
         */

        System.out.printf("\nWhich of the following numbers are Mersenne primes? 7, 17, 23, 127\n");

        if (t.isMersennePrime(7)) {
            System.out.printf("\n7 is a Mersenne Prime\n");
        } else {
            System.out.printf("\n7 is not a Mersenne Prime\n");
        }

        if (t.isMersennePrime(17)) {
            System.out.printf("\n17 is a Mersenne Prime\n");
        } else {
            System.out.printf("\n17 is not a Mersenne Prime\n");
        }

        if (t.isMersennePrime(23)) {
            System.out.printf("\n23 is a Mersenne Prime\n");
        } else {
            System.out.printf("\n23 is not a Mersenne Prime\n");
        }

        if (t.isMersennePrime(127)) {
            System.out.printf("\n127 is a Mersenne Prime\n");
        } else {
            System.out.printf("\n127 is not a Mersenne Prime\n");
        }

        /*
         * Factorial & EULER
         */

        System.out.printf("\nEnter a number: ");
        n = k.nextInt();

        cal = t.factorial(n) - (Math.sqrt(2 * Math.PI * n) * Math.pow((n / Monday.EULER), n));

        System.out.printf("\n%f\n", cal);
    }
}
