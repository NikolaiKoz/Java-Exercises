import java.util.Scanner;

public class ej5 {
    public static void main (String[] args){
        /* Write a program what charge a array[3][3], with pair numbers.
        The program stats in 2 and each location is twice the previous one.
        Then ask for an x and y position and display the corresponding result.
         */

        Scanner read = new Scanner(System.in);
        int arrayPair[][] = new int[3][3];
        int x;
        int y;

        arrayPair = chargeArray(arrayPair);

        show(arrayPair);

        System.out.println("\nEnter a value for x");
        x = read.nextInt();
        System.out.println("\nEnter a value for y");
        y = read.nextInt();

        showPosition(arrayPair, x, y);

        read.close();

    }





    public static int[][] chargeArray(int array[][]){

        int value = 2;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = value;
                value *= 2;
            }
        }
        return (array);
    }





    public static void show(int array[][]){

        System.out.println("Your result:\n");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + ", ");
            }
            System.out.println("\n");
        }
    }




    public static void showPosition(int array[][], int i, int j){

        System.out.println("Your result:\n");

                System.out.print(array[i][j] + ", ");


        }
    }

