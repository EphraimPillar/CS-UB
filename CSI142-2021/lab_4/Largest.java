/**
 * This is the work of Ephraim Pillar.
 */

import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;

public class Largest {
    public static void main(String[] args) throws IOException {

        String inputFileName;
        int largestPrime;
        int temp;
        boolean prime;

        Scanner in = new Scanner(System.in);

        System.out.printf("Enter the input file name: ");
        inputFileName = in.nextLine();

        Scanner input = new Scanner(new FileReader(inputFileName));
        

        largestPrime = input.nextInt();

        // while (CSI142Math.isPrime(largestPrime) == false) {
        //     largestPrime = input.nextInt();
        // }

        temp = 0;
        prime = true;
        while (input.hasNext()) {
            temp = input.nextInt();

            // while (CSI142Math.isPrime(temp) == false) {
            //     temp = input.nextInt();
            // }

            if (largestPrime < temp) {
                prime = CSI142Math.isPrime(temp);
                
                if (prime) {
                    largestPrime = temp;
                }
                
            }
        }

        System.out.printf("\nLargest prime: %d\n", largestPrime);

        in.close();
        input.close();
    }
}
