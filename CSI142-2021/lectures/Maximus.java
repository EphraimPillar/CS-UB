import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

public class Maximus {
    public static void main(String[] args) throws IOException {
        int max = 0;
        int currentSize;
        int count = 0;
        int num;

        if (args.length != 1) {
            System.err.printf("Error! Usage is: java Maximus <filename>\n");
            System.exit(1);
        }

        Scanner input = new Scanner(new FileReader(args[0]));

        while (input.hasNext()) {
            num = input.nextInt();
            count++; 
        }

        int[] numbers = new int[2*count];

        currentSize = 0;
        input = new Scanner(new FileReader(args[0])); // re-open the file

        while (currentSize < numbers.length && input.hasNext()) {
            num = input.nextInt();
            numbers[currentSize] = num;
            currentSize++;
        }

        max = numbers[0];
        for(int i = 1; i < currentSize; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.printf("\nMax = %d\n", max);
        
        input.close();
    }
}
