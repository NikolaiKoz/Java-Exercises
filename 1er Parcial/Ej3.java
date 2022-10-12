
public class Ej3 {
    public static void main(String[] args) {

        int arrayA[][] = new int[3][3];
        int arrayB[][] = new int[3][3];

        arrayA = chargeArray(arrayA);
        arrayB = chargeArray(arrayB);

        show(arrayA);
        show(arrayB);

        sumAndShow(arrayA, arrayB);

    }


    public static int[][] chargeArray(int array[][]){

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                int numero = (int)(Math.random()*10+1);
                array[i][j] = numero;
            }
        }
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

    }

    public static void sumAndShow(int arrayA[][], int arrayB[][]){
        int sumArrays[][] = new int[3][3];

        System.out.println("Your result:\n");

        for (int i = 0; i < sumArrays.length; i++) {
            for (int j = 0; j < sumArrays.length; j++) {
                if(arrayA[i][j] >= arrayB[i][j]){
                    sumArrays[i][j] = arrayA[i][j] - arrayB[i][j];
                } else{
                    sumArrays[i][j] = arrayA[i][j] + arrayB[i][j];
                }
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