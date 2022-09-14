
import java.util.Scanner;

public class ej1{
        public static void main(String[] args) {
                /* Read 5 numbers entered by keyboard, copy them to another array multiplied by 2 and display the second array    */
                int numbers[] = new int[5];
                Scanner read = new Scanner(System.in);

                for (int i = 0; i < 5; i++) {
                        System.out.println("Enter a number and press the key 'Enter'  5 times (" + (i+1) +")");
                        numbers[i] = 2 * read.nextInt();
                }

                read.close();

                System.out.println("\n\n\n");
                for (int i = 0; i < numbers.length; i++) {
                        System.out.print(numbers[i] + " ");
                }
        }
}