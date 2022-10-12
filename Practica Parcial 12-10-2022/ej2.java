import java.util.*;

public class ej2 {
    public static void main(String[] args) {

        messege();

    }

    public static void messege (){

        Scanner teclado = new Scanner(System.in);
        int array[] = new int[50];


        boolean repeat = false;
        int likes = 0;
        int disLikes = 0;
        do {

            System.out.println("Te gusto la presentacion?\nIngrese 1 para SI o 2 para NO:\t");
            int answer = teclado.nextInt();


            if (answer == 1){
                likes ++;
            } else{
                disLikes ++;
            }

            System.out.println("Del 1 al 10 como calificarias al producto presentado?:\t");
            answer = teclado.nextInt();

            for (int i = 0; i < array.length; i++) {
                if(array[i] == 0){
                    array[i] = answer;
                    i = array.length;
                }
            }


            System.out.println("Ingresar otro dato?\nIngrese 1 para SI o 2 para NO:\t");
            answer = teclado.nextInt();

            if(answer == 1){
                repeat = true;
            } else{
                repeat = false;
            }

        } while (repeat);

        sum(array, likes, disLikes);

        teclado.close();


    }


    public static void sum (int[] array, int likes, int disLikes){

        int count = 0;

        for (int i = 0; i < array.length; i++) {

            count += array[i];
        }


        show(count, likes, disLikes);

    }

    public static void show(int count, int likes, int disLikes){

        System.out.println("\n\nPromedio: " + (count / (likes + disLikes)));
        System.out.println("Likes: " + likes);
        System.out.println("Dislikes: " + disLikes);


    }





}
