/**
 * This is the work of Ephraim Pillar.
 */

import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;

public class NumStats {
    public static void main(String[] args) throws IOException {

        /*
         * Declaring variables
         */

        int currentSize, count;
    
        int temp;
        int minInteger;
        int i;

        int noOfPositive, noOfNegative, noOfEqualToZero;
        int[] nums;
        
        /* Checking to see if a filename was provided */
        if (args.length != 1) {
            System.err.printf("ERROR! Enter a file name..");
            System.exit(1);
        }

        /* Open file for reading */
        Scanner input = new Scanner(new FileReader(args[0]));

        /*
         * Setting the array to twice the number of numbers in the file
         */

        count = 0;

        while (input.hasNext()) {
            input.nextInt();
            count++;
        }

        nums = new int[2 * count];

        System.out.printf("\nArray length: %d\n", nums.length);
        
        /*
         * Read the numbers into the array nums[]
         */

        /* Re-opening file for reading */
        input = new Scanner(new FileReader(args[0]));

        currentSize = 0;

        for (i = 0; input.hasNext(); i++) {
            nums[i] = input.nextInt();
            currentSize++;
        }

        System.out.printf("\nValue of current size: %d\n", currentSize);

        /*
         * How many numbers are negative, equal to 0, or positive
         */

        noOfNegative = 0;
        noOfEqualToZero = 0;
        noOfPositive = 0;

        for (i = 0; i < currentSize; i++) {
            temp = nums[i];

            if (temp < 0) {
                noOfNegative++;
            }
            if (temp == 0) {
                noOfEqualToZero++;
            }
            if (temp > 0) {
                noOfPositive++;
            }
        }

        System.out.printf("\nThe number of: \n\t- Negative numbers: %d\n\t- Numbers equal to zero: %d\n\t- Positive numbers: %d\n", noOfNegative, noOfEqualToZero, noOfPositive);


        /*
         * Minimum integer
         */

        minInteger = nums[0];

        for (i = 1; i < currentSize; i++) {
            temp = nums[i];

            if (temp < minInteger) {
                minInteger = temp;
            }
        }
        
        System.out.printf("\nThe minimum integer is: %d\n", minInteger);

        /* Closing file */
        input.close();
    }
}
