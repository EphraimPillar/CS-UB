/**
 * This is the work of Ephraim Pillar.
 */

import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;
import java.io.PrintWriter;

public class CutOff {
    public static void main(String[] args) throws IOException {

        int C;

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
        
        while (inputFileName.equals(outputFileName)) {
            System.out.printf("\nYour input & output file names cannot be the same.. \n");
            
            System.out.printf("Re-enter an input file name: ");
            inputFileName = in.nextLine();
            
            System.out.printf("Re-enter an output file name: ");
            outputFileName = in.nextLine();
        }

        System.out.printf("Please enter a positive integer: ");
        C = in.nextInt();

        while (C < 0) {
            System.out.printf("Please enter a positive integer: ");
            C = in.nextInt();
        }

        Scanner input = new Scanner(new FileReader(inputFileName));
        PrintWriter output = new PrintWriter(outputFileName);

        output.printf("C is: %d", C);

        while (input.hasNextLine()) {
            currentDogName = input.next();
            currentDogAge = input.nextInt();

            if (currentDogAge <= C) {
                dogName = currentDogName;
                dogAge = currentDogAge;
                output.printf("\n* Name: %s\n* Age: %d\n", dogName, dogAge);    
            }
        }

        in.close();
        input.close();
        output.close();
    } 
}