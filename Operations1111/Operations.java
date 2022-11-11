package Operations1111;
import java.util.Scanner;

public class Operations {


    //Attributes
    int number1;
    int number2;
    int add;
    int subtract;
    int multiply;
    int divide;

    //Methods

    //User enters two numbers by keyboard
    public void enterNumbers() {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        number1 = keyboard.nextInt();

        System.out.println("Enter the second number: ");
        number2 = keyboard.nextInt();

        keyboard.close();
    }

    //Addition
    public void addition() {
        add = number1 + number2;
    }

    //Subtraction
    public void subtraction() {
        subtract = number1 - number2;
    }

    //Multiplication
    public void multiplication() {
        multiply = number1 * number2;
    }

    //Division
    public void division() {
        divide = number1 / number2;
    }

    //Show results
    public void showResults() {
        System.out.println("The addition of " + number1 + " and " + number2 + " is " + add);
        System.out.println("The subtraction of " + number1 + " and " + number2 + " is " + subtract);
        System.out.println("The multiplication of " + number1 + " and " + number2 + " is " + multiply);
        System.out.println("The division of " + number1 + " and " + number2 + " is " + divide);
    }

}
