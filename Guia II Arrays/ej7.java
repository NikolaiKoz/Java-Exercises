import java.util.Scanner;

public class ej7 {
    public static void main(String[] args){
        /* That loads a 3x3 matrix with numbers entered from the keyboard, then displays the matrix and the elements on the leading diagonal. */
        int array[][] = new int[3][3];

        array = chargeArray(array);

        show(array);

    }





    public static int[][] chargeArray(int array[][]){

        Scanner read = new Scanner(System.in);
        int value;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println("Enter a value");
                value = read.nextInt();
                array[i][j] = value;
            }
        }
        read.close();
        return (array);
    }





    public static void show(int array[][]){

        int diagonal[] = new int [3];
        System.out.println("Your matrix:\n");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + ", ");
                if(i == j){
                    diagonal[i] = array[i][j];
                }
            }
            System.out.println("\n");
        }
        System.out.print("Your diagonal:\n");
        for (int i = 0; i < diagonal.length; i++) {
            System.out.println(diagonal[i] + ", ");
        }

    }
}
