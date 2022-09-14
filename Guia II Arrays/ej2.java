import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        /* Write a program what enter 10 numbers of type int and save the data in an array, after find one number what by enter for the user and inform his position in an array if the number not exist "print the message "Not founded" " */

        int numbers[] = new int [10];
        Scanner read = new Scanner(System.in);
        int search;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter 10 numbers type int ("+ (i+1) + ")");
            numbers[i] = read.nextInt();
        }

        System.out.println("Successful!!!");

        System.out.print("\n\nEnter a number for search: ");
        search = read.nextInt();
        read.close();

        for (int i = 0; i < numbers.length; i++) {
            if(search == numbers[i]){
                System.out.println("We find the number: " + numbers[i] + " in the position " + i);
                i = numbers.length + 1;
            }else{
                if((i+1) == numbers.length)
                System.out.println("Not found");
            }
        }

    }
}
