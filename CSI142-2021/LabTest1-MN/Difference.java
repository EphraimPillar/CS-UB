/**
 * This is the work of Ephraim Pillar.
 */

import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;
import java.io.PrintWriter;

public class Difference {
    public static void main(String[] args) throws IOException {
        
        /* Declaring variables */

        String inputFileName, outputFileName, tempPassword, password;
        String weakPassword, strongPassword;

        int difference, tempPasswordStrength, tempPasswordLength;
        int weakPasswordLength , strongPasswordLength, weakPasswordStrength, strongPasswordStrength;

        Scanner keyboard = new Scanner(System.in);

        /* Getting file names */

        System.out.printf("Enter the input file name: ");
        // inputFileName = keyboard.nextLine();
        inputFileName = "pword-dataset.dat";

        System.out.printf("Enter the output file name: ");
        // outputFileName = keyboard.nextLine();
        outputFileName = "difference.txt";

        Scanner input = new Scanner(new FileReader(inputFileName));
        
        /* 
         * Finding longest weak password 
         */

        /* Intial input */
        weakPassword = input.next(); 
        weakPasswordLength = weakPassword.length();
        weakPasswordStrength = input.nextInt();

        /* Ensuring initial input from file is a weak password */
        
        while (weakPasswordStrength != 0 && input.hasNextLine()) {
            weakPassword = input.next(); 
            weakPasswordLength = weakPassword.length();
            weakPasswordStrength = input.nextInt();
        }

        /* Rest of file */
        
        while (input.hasNextLine()) {
            tempPassword = input.next();
            tempPasswordLength = tempPassword.length();
            tempPasswordStrength = input.nextInt();

            /* Ensuring temp is a weak password */

            // while (tempPasswordStrength != 0 && input.hasNextLine()) {
            //     tempPassword = input.next(); 
            //     tempPasswordLength = tempPassword.length();
            //     tempPasswordStrength = input.nextInt();
            // }

            if (tempPasswordStrength == 0 && weakPasswordStrength == 0) {
                if (tempPasswordLength > weakPasswordLength) {
                    weakPassword = tempPassword;
                    weakPasswordLength = tempPasswordLength;
                }
            }
        }

        /* Closing file */

        input.close();

        /* 
         * Finding longest strong password 
         */

        /* Re-opening file */

        input = new Scanner(new FileReader(inputFileName));

        /* Intial input */

        strongPassword = input.next(); 
        strongPasswordLength = strongPassword.length();
        strongPasswordStrength = input.nextInt();

        /* Ensuring initial input from file is a strong password */

        while (strongPasswordStrength != 2 && input.hasNextLine()) {
            strongPassword = input.next(); 
            strongPasswordLength = weakPassword.length();
            strongPasswordStrength = input.nextInt();
        }

        /* Rest of file */

        while (input.hasNextLine()) {
            tempPassword = input.next();
            tempPasswordLength = tempPassword.length();
            tempPasswordStrength = input.nextInt();

            /* Ensuring temp is a strong password */

            // while (tempPasswordStrength != 2 && input.hasNextLine()) {
            //     tempPassword = input.next(); 
            //     strongPasswordLength = tempPassword.length();
            //     tempPasswordStrength = input.nextInt();
            // }

            if (tempPasswordStrength == 2 && strongPasswordStrength == 2) {
                if (tempPasswordLength > strongPasswordLength) {
                    strongPassword = tempPassword;
                    strongPasswordLength = tempPasswordLength;
                }
            }
        }

        /* 
         * Output to file 
         */

        PrintWriter output = new PrintWriter(outputFileName);

        difference = strongPasswordLength - weakPasswordLength;

        output.printf("\nLongest Weak Password: %s\nLongest Strong Password: %s\nDifference: %d\n", weakPassword, strongPassword, difference);

        keyboard.close();
        input.close();
        output.close();
    }
}
