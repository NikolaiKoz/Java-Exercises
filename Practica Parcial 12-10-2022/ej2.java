import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {


    }

    public void messege (){

        Scanner teclado = new Scanner(System.in);
        int array[] = new int[1];

        System.out.println("Te gusto la presentacion?\nIngrese 1 para SI o 2 para NO:\t");
        int answer = teclado.nextInt();

        likes(answer);

        System.out.println("Del 1 al 10 como calificarias al producto presentado?:\t");
        answer = teclado.nextInt();

        array.add(answer);

        teclado.close();
    }

    public static void likes (int n){

        int likes = 0;
        int disLikes = 0;

        if (n == 0){
            likes ++;
        } else{
            disLikes ++;
        }
    }





}
