/**
 * This is the work of Ephraim Pillar.
 */

import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;
import java.io.PrintWriter;

public class Oldest {
    public static void main(String[] args) throws IOException {
        
        String inputFileName;
        String outputFileName;
        String dogName = "";
        String currentDogName;
        int dogAge = 0;
        int currentDogAge;

        Scanner in = new Scanner(System.in);

        System.out.printf("Enter the input file name: ");
        inputFileName = in.nextLine();

        System.out.printf("Enter the output file name: ");
        outputFileName = in.nextLine();

        Scanner input = new Scanner(new FileReader(inputFileName));

        while (input.hasNextLine()) {
            currentDogName = input.next();

            currentDogAge = input.nextInt();
            
            if (dogAge < currentDogAge) {
                dogName = currentDogName; 
                dogAge = currentDogAge;
            }
        }

        PrintWriter output = new PrintWriter(outputFileName);

        output.printf("\nThe oldest dog:\n* Name: %s\n* Age: %d\n", dogName, dogAge);
        
        // System.out.printf("\nThe oldest dog:\n* Name: %s\n* Age: %d\n", dogName, dogAge);

        in.close();
        input.close();
        output.close();
    }
}