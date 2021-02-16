/**
 * This is the work of Ephraim Pillar.
 */

import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;

public class SumOfAges {
    public static void main(String[] args) throws IOException {

        String inputFileName;
        int ages = 0;
        int averageAge = 0;
        int numberOfAges = 0;

        Scanner in = new Scanner(System.in);

        System.out.printf("Enter the input file name: ");
        inputFileName = in.nextLine();

        Scanner input = new Scanner(new FileReader(inputFileName));

        while (input.hasNextLine()) {
            input.next();
            ages = ages + input.nextInt();
            numberOfAges++;
        }

        averageAge = ages / (numberOfAges);

        System.out.printf("\nNumber of ages: %d\n", numberOfAges);
        System.out.printf("\nSum of ages: %d\n", ages);
        System.out.printf("\nAverage age: %d\n", averageAge);

        in.close();
        input.close();
    }
}
