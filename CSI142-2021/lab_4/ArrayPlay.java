/**
 * This is the work of Ephraim Pillar.
 */

import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;

public class ArrayPlay {
    public static void main(String[] args) throws IOException {

        String inputFileName;
        int count;
        int sum;
        int average;
        int min;

        int num[] = new int[1000];

        Scanner in = new Scanner(System.in);

        System.out.printf("Enter the input file name: ");
        inputFileName = in.nextLine();

        Scanner input = new Scanner(new FileReader(inputFileName));

        count = 0;
        sum = 0;
        while (count < 1000) {
            num[count] = input.nextInt();
            sum += num[count];
            count++;
        }

        average = sum / count;

        System.out.printf("\nSum: %d\nAverage: %d\n", sum, average);
        
        count = 0;
        while (count < 1000) {
            if (count % 2 == 1) {
                num[count] += 100;
            }
                count++;
        }

        count = 0;
        min = num[count];
        while (count < 1000) {
            if (num[count] < min) {
                min = num[count];
            }
            count++;
        }

        System.out.printf("\nMin: %d\n", min);

        in.close();
        input.close();
    }
}
