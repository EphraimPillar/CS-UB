/**
 * This is the work of Ephraim Pillar.
 */

import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;

public class RelativePrimes {
    public static void main(String[] args) throws IOException {

        String inputFileName;
        int count;
        int num1, num2;

        Scanner in = new Scanner(System.in);

        System.out.printf("Enter the input file name: ");
        inputFileName = in.nextLine();

        Scanner input = new Scanner(new FileReader(inputFileName));

        count = 0;
        num1 = 0; 
        num2 = 0;
        
        while (input.hasNext()) {
            num1 = input.nextInt();
            num2 = input.nextInt();

            System.out.printf("\n%d & %d\n", num1, num2);

            if (CSI142Math.isPrime(num1) && CSI142Math.isPrime(num2)) {
                if (CSI142Math.hcf(num1, num2) == 1) {
                    count++;
                }
            }
        }

        System.out.printf("\nPairs of numbers that are relatively prime: %d\n", count);

        in.close();
        input.close();
    }
}
