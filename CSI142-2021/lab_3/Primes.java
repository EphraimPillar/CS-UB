/**
 * This is the work of Ephraim Pillar.
 */

import java.util.Scanner;

public class Primes {
    public static void main(String[] args) {

        int n;
        int k;
        boolean prime;  
        
        Scanner in = new Scanner(System.in);
        
        System.out.printf("Enter a number to check if it's a prime number: ");
        n = in.nextInt();
        
        prime = true; // Assuming n is prime
        k = 2;

        while (prime && (k < n)) {

            if (n % k == 0) {
                prime = false;
            }

            k++;
        }

        if (prime) {
            System.out.printf("\n%d is a prime number.\n", n);
        } else {
            System.out.printf("\n%d is a not a prime number.\n", n);
        }

        in.close();
    }
}
