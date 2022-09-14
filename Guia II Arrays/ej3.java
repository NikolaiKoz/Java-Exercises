import java.util.Scanner;

public class ej3 {
    public static void main (String[] args){
        /* Write a program what enter the 10 heights of computer students, show on the screen the height of each student, and obtain the highest and lowest,the average and the number of students above and below this*/

        /* The program will have an array with the heights of the ten students. Two counters, one for the above of average and another for the students below it. */

        /* */

        float heights[] = new float[10];
        Scanner read = new Scanner(System.in);
        float higher = 0;
        float lower = 10;
        float half = 0;

        System.out.println("NOTE: Use ','");
        for (int i = 0; i < heights.length; i++) {
            System.out.println("Enter the heights of ten students (" + (i+1) + ")");
            heights[i] = read.nextFloat();
            half += heights[i];
            higher = higher > heights[i] ? higher : heights[i];
            lower = lower < heights[i] ? lower : heights[i];
        }

        read.close();

        half /= heights.length;

        System.out.println("\n\nhigher: "+ higher + "\nlower: " + lower + "\nhalf: " + half);
    }
}
