import java.util.Scanner;


public class ej4{
    public static void main(String[] args){
        /* Write a program that can input the int values of two arrays and create another array that is the sum of the first two. */
        Scanner read = new Scanner(System.in);
        int arrayA[][] = new int[2][2];
        int arrayB[][] = new int[2][2];

        System.out.println("Enter the values of the first array");

        arrayA = chargeArray(arrayA, read);

        System.out.println("Enter the values of the second array");

        arrayB = chargeArray(arrayB, read);

        read.close();

        System.out.print("\n\n\n");

        sumAndShow(arrayA, arrayB);
    }

    public static int[][] chargeArray(int array[][], Scanner read){

        int value = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println("Enter a value for the position " + i + "." + j);
                value = read.nextInt();
                array[i][j] = value;
            }
        }
        return (array);
    }

    public static void sumAndShow(int arrayA[][], int arrayB[][]){
        int sumArrays[][] = new int[2][2];

        System.out.println("Your result:\n");

        for (int i = 0; i < sumArrays.length; i++) {
            for (int j = 0; j < sumArrays.length; j++) {
                sumArrays[i][j] = arrayA[i][j] + arrayB[i][j];
            }
        }

        for (int i = 0; i < sumArrays.length; i++) {
            for (int j = 0; j < sumArrays.length; j++) {
                System.out.print(sumArrays[i][j] + ", ");
            }
            System.out.println("\n");
        }
    }
}