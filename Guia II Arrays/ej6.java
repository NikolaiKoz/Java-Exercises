


public class ej6 {
    public static void main (String[] args){
        /* That fills a 3x3 matrix with the numbers from 0 to 8, and shows its transpose */
        int array[][] = new int[3][3];
        array = chargeArray(array);
        show(array);
        showTranspose(array);
    }





    public static int[][] chargeArray(int array[][]){

        int value = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = value;
                value += 1;
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

    public static void showTranspose(int array[][]){

        System.out.println("Your result:\n");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j][i] + ", ");
            }
            System.out.println("\n");
        }
    }
}
