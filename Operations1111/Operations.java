package Operations1111;
// import java.util.Scanner;

public class Operations {


    //Attributes
    // int number1;
    // int number2;
    // int add;
    // int subtract;
    // int multiply;
    // int divide;

    //Methods

    //User enters two numbers by keyboard
    // public void enterNumbers() {
    //     Scanner keyboard = new Scanner(System.in);

    //     System.out.println("Enter the first number: ");
    //     number1 = keyboard.nextInt();

    //     System.out.println("Enter the second number: ");
    //     number2 = keyboard.nextInt();

    //     keyboard.close();
    // }

    //Addition
    public int addition(int number1, int number2) {
        int add = number1 + number2;
        return add;
    }

    //Subtraction
    public int subtraction(int number1, int number2) {
        int subtract = number1 - number2;
        return subtract;
    }

    //Multiplication
    public int multiplication( int number1, int number2) {
        int multiply = number1 * number2;
        return multiply;
    }

    //Division
    public int division(int number1, int number2) {
        int divide = number1 / number2;
        return divide;
    }

    //Show results
    public void showResults( int number1, int number2, int add, int subtract, int multiply, int divide) {
        System.out.println("The addition of " + number1 + " and " + number2 + " is " + add );
        System.out.println("The subtraction of " + number1 + " and " + number2 + " is " + subtract);
        System.out.println("The multiplication of " + number1 + " and " + number2 + " is " + multiply);
        System.out.println("The division of " + number1 + " and " + number2 + " is " + divide);
    }

}
